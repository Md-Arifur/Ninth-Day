package com.bitm.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    private TextView nameTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        nameTV = findViewById(R.id.nameTV);
        if (getIntent().getExtras()!=null){
            String name = getIntent().getStringExtra("name");
            nameTV.setText(name);
        }
    }
}
