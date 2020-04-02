package com.example.multilanguagesupport;

import android.app.Activity;
import android.os.Bundle;

import java.util.Locale;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Locale.getDefault().getLanguage();
        setContentView(R.layout.activity_second);
    }


}
