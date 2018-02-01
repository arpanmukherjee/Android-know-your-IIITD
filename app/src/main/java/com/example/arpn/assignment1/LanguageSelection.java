package com.example.arpn.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ToggleButton;

public class LanguageSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_selection);
    }

    public void onClick(View view)
    {
        String language;
        boolean check = ((ToggleButton) view).isChecked();
        if(check)
            language = "en";
        else
            language = "hi";
        if(language.equals("en")) {
            Intent switchIntent = new Intent(this, MenuNavigator.class);
            switchIntent.putExtra("language", language);
            startActivity(switchIntent);
        }
        else
        {
            Intent switchIntent = new Intent(this, hindiMessage.class);
            switchIntent.putExtra("language", language);
            startActivity(switchIntent);
        }
    }
}
