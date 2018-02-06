package com.example.arpn.assignment1;

import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;
import java.util.Locale;

public class HindiMessage_A1_MT17007 extends AppCompatActivity {

    private TextView mTextMessage;
    private int saveState;
    BottomNavigationView navigation;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            saveState = item.getItemId();
            switch (item.getItemId()) {
                case R.id.hindi_navigation_iiitd:
                    mTextMessage.setText(R.string.hind_title_iiitd);
                    return true;
                case R.id.hindi_navigation_programs:
                    mTextMessage.setText(R.string.hind_title_programs);
                    return true;
                case R.id.hindi_navigation_admission:
                    mTextMessage.setText(R.string.hind_title_ug_admission);
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_message);

        mTextMessage = (TextView) findViewById(R.id.message);
        mTextMessage.setTextColor(Color.parseColor("#FFFFFF"));

        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        navigation.setSelectedItemId(savedInstanceState.getInt("nav"));
        super.onRestoreInstanceState(savedInstanceState);
    }
}
