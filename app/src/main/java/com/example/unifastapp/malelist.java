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

        Button purchasePantsButton = findViewById(R.id.buttonPurchasePants);

        Button purchasePeShirtButton = findViewById(R.id.buttonPurchasePeShirt);

        Button purchasePePantsButton = findViewById(R.id.buttonPurchasePePants);

        purchasePePantsButton.setOnClickListener(v -> {
            Intent intent = new Intent(malelist.this, example_purchase.class);
            startActivity(intent);
        });
    }
}