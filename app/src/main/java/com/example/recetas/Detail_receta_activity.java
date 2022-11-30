package com.example.recetas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.recetas.databinding.ActivityDetailRecetaBinding;
import com.squareup.picasso.Picasso;

public class Detail_receta_activity extends AppCompatActivity {
    private ActivityDetailRecetaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_detail_receta);
        readExtra();
    }

    private void readExtra() {
        if (getIntent() != null && getIntent().getExtras() != null) {
            if (getIntent().getExtras().containsKey(Constants.RECETA_NAME)) {
                configToolbar(getIntent().getExtras().getString(Constants.RECETA_NAME));
            }

            if (getIntent().getExtras().containsKey(Constants.INGREDIENTS)) {
                binding.textShowIngredients.setText(getIntent().getExtras().getString(Constants.INGREDIENTS));
            }

            if (getIntent().getExtras().containsKey(Constants.PREPARATION)) {
                binding.textShowPreparacion.setText(getIntent().getExtras().getString(Constants.PREPARATION));
            }

            if (getIntent().getExtras().containsKey(Constants.URL_IMG)) {
                Picasso.with(this).load(getIntent().getExtras().getString(Constants.URL_IMG)).into(binding.imgReceta);
            }
        }
    }

    private void configToolbar(String toolbarName) {
        setSupportActionBar(binding.toolbarRecetaDetail);
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