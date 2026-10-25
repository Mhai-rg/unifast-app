package com.example.unifastapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ItemLists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_lists);

        // Find the buttons
        Button femaleButton = findViewById(R.id.femaleButton);
        Button maleButton = findViewById(R.id.maleButton);

        // FEMALE button
        femaleButton.setOnClickListener(v -> {
            Toast.makeText(
                    ItemLists.this,
                    "Female uniform selected!",
                    Toast.LENGTH_SHORT
            ).show();
        });

        // MALE button
        maleButton.setOnClickListener(v -> {
            Toast.makeText(
                    ItemLists.this,
                    "Male uniform selected!",
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}