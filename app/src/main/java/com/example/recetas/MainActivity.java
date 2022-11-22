package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;


import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private SplashScreen.KeepOnScreenCondition codition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        loadSplash();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /***ES IMPORTANTE QUE CAMBIES ESTE SPLASH A LA PANTALLA PRINCIPAL EN ESTE CASO ES LOGIN ACTIVITY
     * VALIDAR SI SE ELIMINA MAIN Y TE QUEDAS CON LOGIN O LO QUE CREAS CORRECTO*/
    private void loadSplash(){
        SplashScreen customSplash = SplashScreen.installSplashScreen(this);

        codition =  new SplashScreen.KeepOnScreenCondition(){

            @Override
            public boolean shouldKeepOnScreen() {
                boolean existUser = true;
                if(existUser){
                    MainActivity.this.startActivity(new Intent(MainActivity.this,LoginActivity.class));
                    finish();
                }
                return false;
            }
        };

        customSplash.setKeepOnScreenCondition(codition);
    }
}