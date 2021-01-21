package com.green_station_20.problem3.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.green_station_20.problem3.R;

public class DetailsActivity extends AppCompatActivity {

    TextView indications, therapeutic_class, pharmacology, dosage, interaction,
            contraindications, side_effects, pregnancy, precautions, storage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        indications = findViewById(R.id.indicationsId);
        therapeutic_class = findViewById(R.id.therapeutic_classId);
        pharmacology = findViewById(R.id.pharmacologyId);
        dosage = findViewById(R.id.dosageId);
        interaction = findViewById(R.id.interactionId);
        contraindications = findViewById(R.id.contraindicationsId);
        side_effects = findViewById(R.id.side_effectsId);
        pregnancy = findViewById(R.id.pregnancyId);
        precautions = findViewById(R.id.precautionsId);
        storage = findViewById(R.id.storageId);


        String m_indications = getIntent().getExtras().getString("indications");
        String m_therapeutic_class = getIntent().getExtras().getString("therapeutic_class");
        String m_pharmacology = getIntent().getExtras().getString("pharmacology");
        String m_dosage = getIntent().getExtras().getString("dosage");
        String m_interaction = getIntent().getExtras().getString("interaction");
        String m_contraindications = getIntent().getExtras().getString("contraindications");
        String m_side_effects = getIntent().getExtras().getString("side_effects");
        String m_pregnancy = getIntent().getExtras().getString("pregnancy");
        String m_precautions = getIntent().getExtras().getString("precautions");
        String m_storage = getIntent().getExtras().getString("storage");



        indications.setText(m_indications);
        therapeutic_class.setText(m_therapeutic_class);
        pharmacology.setText(m_pharmacology);
        dosage.setText(m_dosage);
        interaction.setText(m_interaction);
        contraindications.setText(m_contraindications);
        side_effects.setText(m_side_effects);
        pregnancy.setText(m_pregnancy);
        precautions.setText(m_precautions);
        storage.setText(m_storage);


    }
}