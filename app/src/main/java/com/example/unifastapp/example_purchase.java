package com.example.unifastapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class example_purchase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_example_purchase);
        ScreenScroll.enable(this, R.id.main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());

            v.setPadding(
                    systemBars.left,
                    systemBars.top,
                    systemBars.right,
                    systemBars.bottom
            );

            return insets;
        });

        // Back Button
        Button backButton = findViewById(R.id.buttonBackPurchase);

        backButton.setOnClickListener(v -> finish());

        // Purchase Button
        Button purchaseButton = findViewById(R.id.buttonInItemList3);
        purchaseButton.setOnClickListener(v -> {
            android.content.Intent intent = new android.content.Intent(example_purchase.this, receiptscreen.class);
            startActivity(intent);
        });
    }
}