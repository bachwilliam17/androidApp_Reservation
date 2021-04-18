package com.example.reservation;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    Button reservations;
    EditText searchBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acceuil);

        image = (ImageView) findViewById(R.id.image1);
        listenImage();

        reservations = (Button) findViewById(R.id.reservation_button);
        listenReservations();

        searchBar = (EditText) findViewById(R.id.searchBar);
        listenSearch();
    }

    private void listenImage() {
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AcceuilPlusOption.class);
                startActivity(i);
            }
        });
    }

    private void listenReservations() {
        reservations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MesReservations.class);
                startActivity(i);
            }
        });
    }

    private void listenSearch() {
        searchBar.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    // Perform action on key press
                    Intent i = new Intent(MainActivity.this, CategoriesResto.class);
                    startActivity(i);
                }
                return false;
            }
        });
    }


}
