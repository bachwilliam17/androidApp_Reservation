package com.example.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class page_reservation extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button reservationConfirmee;
    Button backToCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_reservation);

        reservationConfirmee = (Button) findViewById(R.id.BtnReservationConfirmee);
        reservationConfirmee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(page_reservation.this, reservationConfirmee.class);
                startActivity(i);
            }
        });

        backToCategories = (Button) findViewById(R.id.backToCategories);
        backToCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(page_reservation.this, CategoriesResto.class);
                startActivity(i);
            }
        });

        // le spinner est tiré de : https://www.youtube.com/watch?v=on_OrrX7Nw4
        Spinner spinnerNbPerso = findViewById(R.id.nbPersInput);
        ArrayAdapter<CharSequence> adapterSpinner = ArrayAdapter.createFromResource(this,R.array.nbPers, android.R.layout.simple_spinner_item);
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNbPerso.setAdapter(adapterSpinner);
        spinnerNbPerso.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String textRappel = parent.getItemAtPosition(position).toString(); // cree une string de l'élément sélectionné
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}