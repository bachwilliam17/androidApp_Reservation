package com.example.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MesReservations extends AppCompatActivity {
    ImageView retour;
    ImageView fermerPop;
    Dialog dialog;
    Button info1;
    Button info2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mes_reservations);

        dialog = new Dialog(this);

        info1 = (Button) findViewById(R.id.info1);
        info1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ShowPopup();
            }
        });

        info2 = (Button) findViewById(R.id.info2);
        info2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ShowPopup();
            }
        });
    }

    public void ShowPopup(){
        dialog.setContentView(R.layout.information_supplementaire);
        fermerPop = (ImageView) dialog.findViewById(R.id.fermer);

        fermerPop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                dialog.dismiss();
            }
        });

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }
}