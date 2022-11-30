package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.recetas.databinding.ActivityMenuBinding;

public class MenuActivity extends AppCompatActivity {
    private ActivityMenuBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_menu);

        binding.buttonPlatoFuerte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MenuRecetasActivity.class);
                intent.putExtra(Constants.KEY_RECETAS,Constants.PLATO_FUERTE);
                startActivity(intent);
            }
        });

        binding.buttonPostres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MenuRecetasActivity.class);
                intent.putExtra(Constants.KEY_RECETAS,Constants.POSTRES);
                startActivity(intent);
            }
        });


        binding.buttonSopas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MenuRecetasActivity.class);
                intent.putExtra(Constants.KEY_RECETAS,Constants.SOPAS);
                startActivity(intent);
            }
        });



    }
}