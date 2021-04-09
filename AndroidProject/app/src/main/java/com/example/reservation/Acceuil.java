package com.example.reservation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Acceuil extends AppCompatActivity {
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acceuil);

        image = (ImageView) findViewById(R.id.image1);
        clickListenBtn();

    }

    private void clickListenBtn() {
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Acceuil.this, AcceuilPlusOption.class);
                startActivity(i);
            }
        });


    }
}
