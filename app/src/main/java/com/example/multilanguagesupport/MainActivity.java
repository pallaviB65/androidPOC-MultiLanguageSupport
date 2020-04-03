package com.example.multilanguagesupport;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import java.util.Locale;

public class MainActivity extends Activity {
    Button button;
    String myLocale;
    Locale locale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myLocale = Locale.getDefault().getLanguage();
        locale = new Locale(myLocale);
        Locale.setDefault(locale);

        setContentView(R.layout.activity_main);
        button = findViewById(R.id.loginButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this,SecondActivity.class);
                //myIntent.putExtra("locale", locale);
                startActivity(myIntent);
            }
        });
    }
}
