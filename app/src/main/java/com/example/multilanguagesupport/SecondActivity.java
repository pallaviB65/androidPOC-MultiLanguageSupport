package com.example.multilanguagesupport;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.Toast;

import java.util.Locale;

public class SecondActivity extends Activity {
    String localeName;
    String currentLanguage = "en", currentLang;
    Locale myLocale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       /* Intent intent = getIntent();
        String localeName = intent.getStringExtra("localeName");*/

        //setLocale(localeName);
    }

   /* public void setLocale(String localeName) {
        if (!localeName.equals(currentLanguage)) {
            myLocale = new Locale(localeName);
            Resources res = getResources();
            DisplayMetrics dm = res.getDisplayMetrics();
            Configuration conf = res.getConfiguration();
            conf.locale = myLocale;
            res.updateConfiguration(conf, dm);
            *//*Intent refresh = new Intent();
            refresh.putExtra(currentLang, localeName);
            startActivity(refresh);*//*
        } else {
            Toast.makeText(SecondActivity.this, "Language already selected!", Toast.LENGTH_SHORT).show();
        }
    }*/

}
