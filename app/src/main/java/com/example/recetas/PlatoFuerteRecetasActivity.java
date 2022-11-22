package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.recetas.databinding.ActivityMenuBinding;
import com.example.recetas.databinding.ActivityRecetasBinding;

public class PlatoFuerteRecetasActivity extends AppCompatActivity {
    private ActivityRecetasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_recetas);
    }
}