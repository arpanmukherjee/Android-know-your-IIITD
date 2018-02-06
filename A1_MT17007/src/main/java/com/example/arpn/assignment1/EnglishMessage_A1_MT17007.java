package com.example.arpn.assignment1;

import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class EnglishMessage_A1_MT17007 extends AppCompatActivity {

    private TextView mTextMessage;
    private int saveState;
    BottomNavigationView navigation;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            saveState = item.getItemId();
//            Log.d("Main", "id: " + saveState);

            switch (item.getItemId()) {
                case R.id.navigation_iiitd:
                    mTextMessage.setText(R.string.title_iiitd);
                    return true;
                case R.id.navigation_programs:
                    mTextMessage.setText(R.string.title_programs);
                    return true;
                case R.id.navigation_admission:
                    mTextMessage.setText(R.string.title_ug_admission);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("nav", navigation.getSelectedItemId());
        Log.d("Main", "onSave");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_message);

        mTextMessage = (TextView) findViewById(R.id.message);
        mTextMessage.setTextColor(Color.parseColor("#FFFFFF"));

        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d("Main", "onRestore: " + savedInstanceState.getInt("nav"));
        navigation.setSelectedItemId(savedInstanceState.getInt("nav"));
        Log.d("Main", "onRestore");
        super.onRestoreInstanceState(savedInstanceState);
    }
}
