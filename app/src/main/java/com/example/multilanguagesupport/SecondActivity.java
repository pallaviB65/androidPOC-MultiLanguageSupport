package com.example.multilanguagesupport;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Locale;

public class SecondActivity extends Activity {
    String myLocale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* Intent intent = getIntent();*/
       /* String locale = intent.getStringExtra("locale");
        Locale.setDefault(locale);*/
        /*myLocale = Locale.getDefault().getLanguage();
        Locale locale = new Locale(myLocale);
        Locale.setDefault(locale);*/

        setContentView(R.layout.activity_second);
    }


}
