 package com.example.unifastapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_home);

        ViewCompat.setOnApplyWindowInsetsListener(
                findViewById(R.id.main), (v, insets) -> {
                    Insets systemBars = insets.getInsets(
                            WindowInsetsCompat.Type.systemBars()
                    );

                    v.setPadding(
                            systemBars.left,
                            systemBars.top,
                            systemBars.right,
                            systemBars.bottom
                    );

                    return insets;
                }
        );

        // Shop Female Button
        Button buttonShopFemale = findViewById(R.id.buttonShopFemale);

        buttonShopFemale.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, female_list.class);
            startActivity(intent);
        });

        // Shop Male Button
        Button buttonShopMale = findViewById(R.id.buttonShopMale);

        buttonShopMale.setOnClickListener(v -> {
            Intent intent = new Intent(Home.this, male_list.class);
            startActivity(intent);
        });
    }
}