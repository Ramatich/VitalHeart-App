package com.example.cardiohealth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomePageActivity extends AppCompatActivity {

    private CheckBox cbChestPain, cbShortnessOfBreath, cbPalpitations, cbFatigue;
    private CheckBox cbDizziness, cbSwelling, cbFluttering, cbIrregularHeartbeat;
    private CheckBox cbCough, cbNausea, cbSweating, cbBackPain, cbJawPain;
    private CheckBox cbWeakness, cbAnxiety, cbEdema;
    private Button btnCheckSymptoms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // Initialize views
        cbChestPain = findViewById(R.id.cbChestPain);
        cbShortnessOfBreath = findViewById(R.id.cbShortnessOfBreath);
        cbPalpitations = findViewById(R.id.cbPalpitations);
        cbFatigue = findViewById(R.id.cbFatigue);
        cbDizziness = findViewById(R.id.cbDizziness);
        cbSwelling = findViewById(R.id.cbSwelling);
        cbFluttering = findViewById(R.id.cbFluttering);

        // Add more checkboxes as needed

        btnCheckSymptoms = findViewById(R.id.btnCheckSymptoms);

        // Set click listener for check symptoms button
        btnCheckSymptoms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkSymptoms();
            }
        });
    }

    private void checkSymptoms() {
        // Example of retrieving checkbox states
        boolean hasChestPain = cbChestPain.isChecked();
        boolean hasShortnessOfBreath = cbShortnessOfBreath.isChecked();
        boolean hasPalpitations = cbPalpitations.isChecked();
        boolean hasFatigue = cbFatigue.isChecked();
        boolean hasDizziness = cbDizziness.isChecked();
        boolean hasSwelling = cbSwelling.isChecked();
        boolean hasFluttering = cbFluttering.isChecked();
        boolean hasIrregularHeartbeat = cbIrregularHeartbeat.isChecked();
        boolean hasCough = cbCough.isChecked();
        boolean hasNausea = cbNausea.isChecked();
        boolean hasSweating = cbSweating.isChecked();
        // Add more symptoms as needed

        // Perform actions based on checkbox states
        // For example:
        if (hasChestPain || hasShortnessOfBreath || hasPalpitations || hasFatigue || hasDizziness ||
                hasSwelling || hasFluttering || hasIrregularHeartbeat || hasCough || hasNausea || hasSweating) {
            // Handle symptoms logic
            Toast.makeText(this, "Checking symptoms...", Toast.LENGTH_SHORT).show();

            // Example: Start a new activity to display result
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("hasChestPain", hasChestPain);
            intent.putExtra("hasShortnessOfBreath", hasShortnessOfBreath);
            intent.putExtra("hasPalpitations", hasPalpitations);
            intent.putExtra("hasFatigue", hasFatigue);
            intent.putExtra("hasDizziness", hasDizziness);
            intent.putExtra("hasSwelling", hasSwelling);
            intent.putExtra("hasFluttering", hasFluttering);
            intent.putExtra("hasIrregularHeartbeat", hasIrregularHeartbeat);
            intent.putExtra("hasCough", hasCough);
            intent.putExtra("hasNausea", hasNausea);
            intent.putExtra("hasSweating", hasSweating);
            startActivity(intent);

        } else {
            // No symptoms selected
            Toast.makeText(this, "Please select at least one symptom", Toast.LENGTH_SHORT).show();
        }
    }
}
