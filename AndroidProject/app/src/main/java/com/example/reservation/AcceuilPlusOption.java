package com.example.reservation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AcceuilPlusOption extends AppCompatActivity {

    ImageView image_minus;
    CheckBox checkbox1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acceuil_plus_option);
        image_minus = (ImageView) findViewById(R.id.image2);
        checkbox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkbox1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                goToCategories();
            }
        });
        clickListenBtn();

    }

    private void clickListenBtn() {
        image_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AcceuilPlusOption.this, Acceuil.class);
                startActivity(i);
            }
        });


    }

    public void goToCategories(){
        Intent i = new Intent(AcceuilPlusOption.this, CategoriesResto.class);
        startActivity(i);
    }
}
