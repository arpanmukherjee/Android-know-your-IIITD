package com.example.arpn.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ToggleButton;

public class LanguageSelection_A1_MT17007 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_selection);
    }

    public void onClickEnglish(View view)
    {
        String language = "en";
        Intent switchIntent = new Intent(this, EnglishMessage_A1_MT17007.class);
        switchIntent.putExtra("language", language);
        startActivity(switchIntent);
    }

    public void onClickHindi(View view)
    {
        String language = "hi";
        Intent switchIntent = new Intent(this, HindiMessage_A1_MT17007.class);
        switchIntent.putExtra("language", language);
        startActivity(switchIntent);
    }
}
