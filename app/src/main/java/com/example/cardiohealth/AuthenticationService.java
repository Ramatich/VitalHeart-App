package com.example.cardiohealth;

import android.content.Context;
import android.content.SharedPreferences;

public class AuthenticationService {

    private static final String PREFS_NAME = "AuthPrefs";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_PASSWORD = "password";

    private SharedPreferences sharedPreferences;

    public AuthenticationService(Context context) {
        sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    public boolean register(String email, String password) {
        if (sharedPreferences.contains(KEY_EMAIL)) {
            // User already registered
            return false;
        }

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_EMAIL, email);
        editor.putString(KEY_PASSWORD, password);
        editor.apply();

        return true; // Registration successful
    }

    public boolean login(String email, String password) {
        String registeredEmail = sharedPreferences.getString(KEY_EMAIL, null);
        String registeredPassword = sharedPreferences.getString(KEY_PASSWORD, null);

        return email.equals(registeredEmail) && password.equals(registeredPassword);
    }
}
