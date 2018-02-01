package com.example.arpn.assignment1;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import java.util.Locale;

public class hindiMessage extends AppCompatActivity {

    private TextView mTextMessage;
    private String selectedLanguage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_message);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
