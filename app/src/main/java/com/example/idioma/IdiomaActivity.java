package com.example.idioma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;
import java.util.ResourceBundle;

public class IdiomaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idioma);
    }

    public void fechar(View v)
    {
        finish();
    }

    public void idiomaBR(View v)
    {
        Locale idioma = new Locale("pt");
        Locale.setDefault(idioma);

        Context context = this;
        Resources res = context.getResources();
        Configuration config = new Configuration(res.getConfiguration());

        config.setLocale(idioma);
        res.updateConfiguration(config, res.getDisplayMetrics());

        SharedPreferences.Editor dados = getSharedPreferences("fatec", MODE_PRIVATE).edit();
        dados.putString("idioma", "pt");
        dados.apply();

        recreate();
    }

    public void idiomaUSA(View v)
    {
        Locale idioma = new Locale("en");
        Locale.setDefault(idioma);

        Context context = this;
        Resources res = context.getResources();
        Configuration config = new Configuration(res.getConfiguration());

        config.setLocale(idioma);
        res.updateConfiguration(config, res.getDisplayMetrics());

        SharedPreferences.Editor dados = getSharedPreferences("fatec", MODE_PRIVATE).edit();
        dados.putString("idioma", "un");
        dados.apply();

        recreate();
    }

    public void idiomaES(View v)
    {
        Locale idioma = new Locale("es");
        Locale.setDefault(idioma);

        Context context = this;
        Resources res = context.getResources();
        Configuration config = new Configuration(res.getConfiguration());

        config.setLocale(idioma);
        res.updateConfiguration(config, res.getDisplayMetrics());

        SharedPreferences.Editor dados = getSharedPreferences("fatec", MODE_PRIVATE).edit();
        dados.putString("idioma", "es");
        dados.apply();

        recreate();
    }

}