package com.example.reservation;


import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CategoriesResto extends AppCompatActivity{
    Dialog epicDialog;
    ImageView deletePopupCategorie;
    Button menuButton;
    Button horairesButton;

    TextView resto1;
    TextView resto2;
    TextView resto3;
    TextView resto4;
    TextView resto5;
    TextView resto6;
    TextView resto7;
    TextView resto8;
    TextView resto9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categorie_resto);

        epicDialog = new Dialog(this);

        resto1 = (TextView) findViewById(R.id.resto1);
        resto1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               ShowPopup();
            }
        });

        resto2 = (TextView) findViewById(R.id.resto2);
        resto2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ShowPopup();
            }
        });

        resto3 = (TextView) findViewById(R.id.resto3);
        resto3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ShowPopup();
            }
        });

        resto4 = (TextView) findViewById(R.id.resto4);
        resto4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ShowPopup();
            }
        });

        resto5 = (TextView) findViewById(R.id.resto5);
        resto5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ShowPopup();
            }
        });

        resto6 = (TextView) findViewById(R.id.resto6);
        resto6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ShowPopup();
            }
        });

        resto7 = (TextView) findViewById(R.id.resto7);
        resto7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ShowPopup();
            }
        });

        resto8 = (TextView) findViewById(R.id.resto8);
        resto8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ShowPopup();
            }
        });

        resto9 = (TextView) findViewById(R.id.resto9);
        resto9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ShowPopup();
            }
        });
    }

    public void ShowPopup(){
        epicDialog.setContentView(R.layout.information_resto);
        deletePopupCategorie = (ImageView) epicDialog.findViewById(R.id.deletePopupCategorie);
        deletePopupCategorie.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                epicDialog.dismiss();
            }
        });

        menuButton = (Button) epicDialog.findViewById(R.id.buttonMenu);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoriesResto.this, Menu_restaurant.class);
                startActivity(i);
            }
        });

        horairesButton = (Button) epicDialog.findViewById(R.id.buttonHoraires);
        horairesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoriesResto.this, Horaires_restaurant.class);
                startActivity(i);
            }
        });

        epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        epicDialog.show();
    }

}

