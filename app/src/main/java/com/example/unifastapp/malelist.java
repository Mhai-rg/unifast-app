package com.example.unifastapp;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class malelist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_malelist);
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
        Button backButton = findViewById(R.id.buttonBackItemList);

        backButton.setOnClickListener(v -> finish());

        // Purchase Button
        Button purchaseTopButton = findViewById(R.id.buttonPurchaseTop);
        purchaseTopButton.setOnClickListener(v -> startActivity(new android.content.Intent(malelist.this, example_purchase.class)));

        Button purchasePantsButton = findViewById(R.id.buttonPurchasePants);
        purchasePantsButton.setOnClickListener(v -> startActivity(new android.content.Intent(malelist.this, example_purchase.class)));

        Button purchasePeShirtButton = findViewById(R.id.buttonPurchasePeShirt);
        purchasePeShirtButton.setOnClickListener(v -> startActivity(new android.content.Intent(malelist.this, example_purchase.class)));

        Button purchasePePantsButton = findViewById(R.id.buttonPurchasePePants);

        purchasePePantsButton.setOnClickListener(v -> {
            Intent intent = new Intent(malelist.this, example_purchase.class);
            startActivity(intent);
        });
    }
}