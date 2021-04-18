package com.example.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Horaires_restaurant extends AppCompatActivity {
    Button backFromHoraires;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horaires_restaurant);

        backFromHoraires = (Button) findViewById(R.id.backFromHoraires);
        backFromHoraires.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Horaires_restaurant.this, CategoriesResto.class);
                startActivity(i);
            }
        });
    }
}