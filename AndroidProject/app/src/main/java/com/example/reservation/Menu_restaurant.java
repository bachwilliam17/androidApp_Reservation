package com.example.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_restaurant extends AppCompatActivity {
    Button backFromMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_restaurant);

        backFromMenu = (Button) findViewById(R.id.backFromMenu);
        backFromMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu_restaurant.this, CategoriesResto.class);
                startActivity(i);
            }
        });
    }
}