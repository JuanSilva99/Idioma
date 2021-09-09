package com.example.idioma;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        mudarIdioma();
        
        setContentView(R.layout.activity_main);
    }

    public void abrirIdioma(View v)
    {
        Intent tela = new Intent(this, IdiomaActivity.class);
        startActivityForResult(tela, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1){
            recreate();
        }
    }
    
    public void mudarIdioma()
    {
        SharedPreferences.Editor dados = getSharedPreferences("fatec", MODE_PRIVATE).edit();
        String Lang = dados.putString("idioma", "pt");

        Locale idioma = new Locale("pt");
        Locale.setDefault(idioma);

        Context context = this;
        Resources res = context.getResources();
        Configuration config = new Configuration(res.getConfiguration());

        config.setLocale(idioma);
        res.updateConfiguration(config, res.getDisplayMetrics());


    }
}