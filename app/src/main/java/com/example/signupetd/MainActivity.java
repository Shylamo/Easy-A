package com.example.signupetd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
//Variables
    private Button enregistrer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //click bouton Enregistrer to profile etd
        enregistrer = (Button) findViewById(R.id.enregistrer_btn);
        enregistrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profil_student();
            }
        });


// Spinner pour niveaux d etude
        Spinner Niveaux_etd = (Spinner) findViewById(R.id.Niveaux_etd);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Niveaux, android.R.layout.simple_spinner_dropdown_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        Niveaux_etd.setAdapter(adapter);
    }

    public void profil_student()
    {
        Intent intent =new Intent(this,Profile_etudiant.class);
        startActivity(intent);
    }
}