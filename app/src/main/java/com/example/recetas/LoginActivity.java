package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import com.example.recetas.databinding.ActivityLoginBinding;

import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        String keySave = "keySave";
        configToolbar();

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( (binding.inputUserEmali.getText() == null  ||  binding.inputUserEmali.getText().toString().equals("") ||!validarEmail(binding.inputUserEmali.getText().toString().trim())) ||
                        (binding.inputUserPassword.getText() == null  ||  binding.inputUserPassword.getText().toString().equals("") || binding.inputUserPassword.getText().toString().length()<6 ) ){

                    Toast.makeText(getApplicationContext(), getString(R.string.mensaje_ingresar), Toast.LENGTH_LONG).show();

                } else{
                    Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                    //intent.putExtra(Constants.TITLE_SEARCH_DESTINY, binding.editTextNameDestination.getText().toString());
                    startActivity(intent);
                    CustomSharedPreferences.setSharedBoolean("IS_LOGIN_SHARED_KEY",true);
                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                    finish();
                }

            }
        });


    }

    private boolean validarEmail(String email) {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        return pattern.matcher(email).matches();
    }

    private void configToolbar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("LOGIN");
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        checkSession();
    }

    public void checkSession(){
        boolean isLogin = CustomSharedPreferences.getSharedBoolean("IS_LOGIN_SHARED_KEY");
        if(isLogin){
            startActivity(new Intent(LoginActivity.this,MenuActivity.class));
            finish();
        }
    }
}