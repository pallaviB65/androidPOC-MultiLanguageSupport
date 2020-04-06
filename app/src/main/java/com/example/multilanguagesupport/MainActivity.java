package com.example.multilanguagesupport;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

import java.util.Locale;

public class MainActivity extends Activity {
    Button button;
    /*String localeName;
    String currentLanguage = "en", currentLang;
    Locale myLocale;*/
    private static final String LOCALE_KEY = "localekey";
    private static final String HINDI_LOCALE = "hi";
    private static final String FRENCH_LOCALE = "fr";
    private static final String ENGLISH_LOCALE = "en_US";
    private static final String LOCALE_PREF_KEY = "localePref";
    private Locale locale;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*localeName = Locale.getDefault().getLanguage();
        setLocale(localeName);*/
        /*locale = new Locale(myLocale);
        Locale.setDefault(locale);*/

        //Fetching sharedpreferences to get Locale stored in them
        SharedPreferences sp = getSharedPreferences(LOCALE_PREF_KEY, MODE_PRIVATE);
        String localeString = sp.getString(LOCALE_KEY, ENGLISH_LOCALE);

        //            Modifying Locale if User clicked language from options pane
        Resources resources = getResources();
        SharedPreferences sharedPreferences = getSharedPreferences("localePref", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        if(sharedPreferences.getString(LOCALE_KEY, ENGLISH_LOCALE).equals(HINDI_LOCALE)){
            locale = new Locale(ENGLISH_LOCALE);
            editor.putString(LOCALE_KEY, ENGLISH_LOCALE);
        } else {
            locale = new Locale(HINDI_LOCALE);
            editor.putString(LOCALE_KEY, HINDI_LOCALE);
        }
        editor.apply();

        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        getBaseContext().getResources().updateConfiguration(configuration,
                getBaseContext().getResources().getDisplayMetrics());
        recreate();


        button = findViewById(R.id.loginButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this,SecondActivity.class);
               //myIntent.putExtra("localeName", localeName);
                startActivity(myIntent);
            }
        });
    }

    /*public void setLocale(String localeName) {
        if (!localeName.equals(currentLanguage)) {
            myLocale = new Locale(localeName);
            Resources res = getResources();
            DisplayMetrics dm = res.getDisplayMetrics();
            Configuration conf = res.getConfiguration();
            conf.locale = myLocale;
            res.updateConfiguration(conf, dm);
            *//*Intent refresh = new Intent();
            refresh.putExtra("localeName", localeName);
            startActivity(refresh);*//*
        } else {
            Toast.makeText(MainActivity.this, "Language already selected!", Toast.LENGTH_SHORT).show();
        }


    }*/

}
