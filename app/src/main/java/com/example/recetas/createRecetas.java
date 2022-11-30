package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

import com.example.recetas.databinding.ActivityCreateRecetasBinding;

public class createRecetas extends AppCompatActivity {
    private ActivityCreateRecetasBinding binding;
    private boolean checkBoxPlatoFuerte;
    private boolean checkBoxSopas;
    private boolean checkBoxPostres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_create_recetas);

        binding.btnCreateReceta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(createRecetas.this, ObtenerDatos.class);

                String nombrePlatillo = binding.editNamePlatillo.getText().toString();
                intent.putExtra(Constants.USER_NAME_RECETA, nombrePlatillo);

                String numPersonas = binding.editNumPersonas.getText().toString();
                intent.putExtra(Constants.USER_NUM_PERSON, numPersonas);

                String time = binding.editTime.getText().toString();
                intent.putExtra(Constants.USER_TIME, time);

                String ingrediente = binding.editIngredientes.getText().toString();
                intent.putExtra(Constants.USER_INGREDIENTS, ingrediente);

                String preparacion = binding.editPreparacion.getText().toString();
                intent.putExtra(Constants.USER_PREPARACION, preparacion);



               intent.putExtra(Constants.USER_CHECKBOX_PLATO_FUERTE, checkBoxPlatoFuerte);
                intent.putExtra(Constants.USER_CHECKBOX_SOPAS, checkBoxSopas);
                intent.putExtra(Constants.USER_CHECKBOX_POSTRES, checkBoxPostres);

                startActivity(intent);

            }
        });



        binding.radioBtnPlatoFuerte.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBoxPlatoFuerte = isChecked;
                Log.e("Checkbox","Listener Switch is checked: "+isChecked);
            }
        });


        binding.radioBtnSopas.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBoxSopas = isChecked;
                Log.e("Checkbox","Listener Switch is checked: "+isChecked);
            }
        });


        binding.radioBtnPostres.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBoxPostres = isChecked;
                Log.e("Checkbox","Listener Switch is checked: "+isChecked);
            }
        });
    }
}