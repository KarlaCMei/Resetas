package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.recetas.databinding.ActivityObtenerDatosBinding;

public class ObtenerDatos extends AppCompatActivity {
    private ActivityObtenerDatosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_obtener_datos);
        recibirDatos();

    }

    public void recibirDatos(){
        Bundle obtenerDatos = getIntent().getExtras();
        if(obtenerDatos!=null){
            if(obtenerDatos.containsKey(Constants.USER_NAME_RECETA)){
                String obtenerNombrePlatillo= obtenerDatos.getString(Constants.USER_NAME_RECETA);
                binding.textNamePlatillo.setText( obtenerNombrePlatillo);
            }

            if(obtenerDatos.containsKey(Constants.USER_NUM_PERSON)){
                String obtenernumPersonas = obtenerDatos.getString(Constants.USER_NUM_PERSON);
                binding.textNumPersonas.setText(obtenernumPersonas);
            }

            if(obtenerDatos.containsKey(Constants.USER_TIME)){
                String obtenertime = obtenerDatos.getString(Constants.USER_TIME);
                binding.textEditTime.setText(obtenertime);
            }

            if(obtenerDatos.containsKey(Constants.USER_INGREDIENTS)){
                String obtenerIngredientes = obtenerDatos.getString(Constants.USER_INGREDIENTS);
                binding.textIngredients.setText(obtenerIngredientes);
            }

            if(obtenerDatos.containsKey(Constants.USER_PREPARACION)){
                String obtenerPreparacion = obtenerDatos.getString(Constants.USER_PREPARACION);
                binding.textPreparacion.setText(obtenerPreparacion);
            }




           if(obtenerDatos.containsKey(Constants.USER_CHECKBOX_PLATO_FUERTE)){
                boolean obtenerPlatoFuerte = obtenerDatos.getBoolean(Constants.USER_CHECKBOX_PLATO_FUERTE);
                if(obtenerPlatoFuerte){
                    binding.checkBoxPlatoFuerte.setVisibility(View.VISIBLE);
                }
            }
            if(obtenerDatos.containsKey(Constants.USER_CHECKBOX_SOPAS)){
                boolean obtenerSopas = obtenerDatos.getBoolean(Constants.USER_CHECKBOX_SOPAS);
                if(obtenerSopas){
                    binding.checkBoxSopas.setVisibility(View.VISIBLE);
                }
            }
            if(obtenerDatos.containsKey(Constants.USER_CHECKBOX_POSTRES)){
                boolean obtenerPostres = obtenerDatos.getBoolean(Constants.USER_CHECKBOX_POSTRES);
                if(obtenerPostres){
                    binding.checkBoxPostres.setVisibility(View.VISIBLE);
                }
            }


        }
    }
}