package com.example.cardiohealth;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // Retrieve symptom data from intent extras
        boolean hasChestPain = getIntent().getBooleanExtra("hasChestPain", false);
        boolean hasShortnessOfBreath = getIntent().getBooleanExtra("hasShortnessOfBreath", false);
        boolean hasPalpitations = getIntent().getBooleanExtra("hasPalpitations", false);
        boolean hasFatigue = getIntent().getBooleanExtra("hasFatigue", false);
        boolean hasDizziness = getIntent().getBooleanExtra("hasDizziness", false);
        boolean hasSwelling = getIntent().getBooleanExtra("hasSwelling", false);
        boolean hasFluttering = getIntent().getBooleanExtra("hasFluttering", false);
        boolean hasIrregularHeartbeat = getIntent().getBooleanExtra("hasIrregularHeartbeat", false);
        boolean hasCough = getIntent().getBooleanExtra("hasCough", false);
        boolean hasNausea = getIntent().getBooleanExtra("hasNausea", false);
        boolean hasSweating = getIntent().getBooleanExtra("hasSweating", false);

        // Example: Display symptom data in TextView
        TextView tvSymptoms = findViewById(R.id.tvSymptoms);
        StringBuilder symptomsText = new StringBuilder("Selected Symptoms:\n\n");

        if (hasChestPain) {
            symptomsText.append(" - Chest Pain\n");
        }
        if (hasShortnessOfBreath) {
            symptomsText.append(" - Shortness of Breath\n");
        }
        if (hasPalpitations) {
            symptomsText.append(" - Palpitations\n");
        }
        if (hasFatigue) {
            symptomsText.append(" - Fatigue\n");
        }
        if (hasDizziness) {
            symptomsText.append(" - Dizziness\n");
        }
        if (hasSwelling) {
            symptomsText.append(" - Swelling\n");
        }
        if (hasFluttering) {
            symptomsText.append(" - Heart Fluttering\n");
        }
        if (hasIrregularHeartbeat) {
            symptomsText.append(" - Irregular Heartbeat\n");
        }
        if (hasCough) {
            symptomsText.append(" - Cough\n");
        }
        if (hasNausea) {
            symptomsText.append(" - Nausea\n");
        }
        if (hasSweating) {
            symptomsText.append(" - Sweating\n");
        }

        tvSymptoms.setText(symptomsText.toString());
    }
}
