package com.example.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class reservationConfirmee extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Button retourMenu;
    Button backToReservation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservation_confirmee);

        // le spinner est tiré de : https://www.youtube.com/watch?v=on_OrrX7Nw4
        Spinner spinnerRappel = findViewById(R.id.rappelSpinner);
        ArrayAdapter<CharSequence> adapterSpinner = ArrayAdapter.createFromResource(this,R.array.joursNotif, android.R.layout.simple_spinner_item);
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRappel.setAdapter(adapterSpinner);
        spinnerRappel.setOnItemSelectedListener(this);

        retourMenu = (Button) findViewById(R.id.BtnRetourMenu);
        retourMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(reservationConfirmee.this, MainActivity.class);
                startActivity(i);
            }
        });

        backToReservation = (Button) findViewById(R.id.backToReservation);
        backToReservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(reservationConfirmee.this, page_reservation.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String textRappel = parent.getItemAtPosition(position).toString(); // cree une string de l'élément sélectionné
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}