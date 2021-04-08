package com.example.devoir4interfaceversiondave;


import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CategoriesResto extends AppCompatActivity{

    Dialog epicDialog;
    ImageView deletePopupCategorie;
    TextView resto1;


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
        epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        epicDialog.show();
    }

}

