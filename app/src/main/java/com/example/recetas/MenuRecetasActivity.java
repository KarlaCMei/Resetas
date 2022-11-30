package com.example.recetas;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;


import com.example.recetas.adapters.CustomPlatoFuerteAdapter;
import com.example.recetas.adapters.OnClicPlatosFuertesListener;
import com.example.recetas.data.Platillos;
import com.example.recetas.data.PlatosFuertes;
import com.example.recetas.databinding.ActivityRecetasBinding;

public class MenuRecetasActivity extends AppCompatActivity implements OnClicPlatosFuertesListener {
    private ActivityRecetasBinding binding;
    private CustomPlatoFuerteAdapter adapter;

    @SuppressLint("NotifyDataSetChanged")
    ActivityResultLauncher<Intent> startActivityIntent = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    Intent intent = result.getData();
                    if(intent!=null && intent.getExtras()!=null && intent.getExtras().containsKey("CREATE_RECETA")){
                        if(intent.getExtras().getBoolean("CREATE_RECETA")){
                            if(adapter!=null){
                                adapter.notifyDataSetChanged();
                            }
                        }
                    }
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recetas);

        if (getIntent() != null && getIntent().getExtras() != null) {
            if (getIntent().getExtras().containsKey(Constants.KEY_RECETAS)) {
                if (getIntent().getExtras().getInt(Constants.KEY_RECETAS) == Constants.PLATO_FUERTE) {
                    configToolbar(getString(R.string.search_title_plato_fuerte));
                    adapter = new CustomPlatoFuerteAdapter(PlatosFuertes.getListPlatosFuertes(), this);
                } else if (getIntent().getExtras().getInt(Constants.KEY_RECETAS) == Constants.POSTRES) {
                    configToolbar(getString(R.string.search_title_postre));
                    adapter = new CustomPlatoFuerteAdapter(PlatosFuertes.getListPostres(), this);
                } else {
                    adapter = new CustomPlatoFuerteAdapter(PlatosFuertes.getListSopas(), this);
                    configToolbar(getString(R.string.search_title_sopa));
                }
            }

        }

        binding.listPlatillos.setLayoutManager(new GridLayoutManager(this, 1));
        binding.listPlatillos.setAdapter(adapter);


        binding.btnCreateReceta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createReceta = new Intent(MenuRecetasActivity.this, createRecetas.class);
                startActivityIntent.launch(createReceta);
            }
        });

    }


    @Override
    public void onPlatosFueetesClicListener(Platillos platillos) {
        Intent detailActivity = new Intent(this, Detail_receta_activity.class);
        detailActivity.putExtra(Constants.RECETA_NAME, platillos.getNombre());
        detailActivity.putExtra(Constants.INGREDIENTS, platillos.getIngredients());
        detailActivity.putExtra(Constants.PREPARATION, platillos.getPreparation());
        detailActivity.putExtra(Constants.URL_IMG, platillos.getUrlImg());
        startActivity(detailActivity);
    }

    private void configToolbar(String toolbarName) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(toolbarName);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}