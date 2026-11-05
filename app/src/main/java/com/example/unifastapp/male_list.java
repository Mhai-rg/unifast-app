package com.example.unifastapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class male_list extends AppCompatActivity {

    // Replace these with your actual product prices
    private final int maleTopPrice = 0;
    private final int malePantsPrice = 0;
    private final int peShirtPrice = 0;
    private final int pePantsPrice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_male_list);

        // Window Insets
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

        // Connect XML Buttons
        Button buttonMaleTop = findViewById(R.id.buttonMaleTop);
        Button buttonMalePants = findViewById(R.id.buttonMalePants);
        Button buttonPEShirt = findViewById(R.id.buttonPEShirt);
        Button buttonPEPants = findViewById(R.id.buttonPEPants);
        Button buttonBackHome = findViewById(R.id.buttonBackHome);

        // Male Top
        buttonMaleTop.setOnClickListener(v -> {
            openPurchase("Male Top", maleTopPrice, R.mipmap.male_top);
        });

        // Male Pants
        buttonMalePants.setOnClickListener(v -> {
            openPurchase("Male Pants", malePantsPrice, R.mipmap.male_pants);
        });

        // P.E. Shirt
        buttonPEShirt.setOnClickListener(v -> {
            openPurchase("P.E. Shirt", peShirtPrice,
                    R.mipmap.pe_top_male_foreground);
        });

        // P.E. Pants
        buttonPEPants.setOnClickListener(v -> {
            openPurchase("P.E. Pants", pePantsPrice,
                    R.mipmap.pe_pants_foreground);
        });

        // Back Home
        buttonBackHome.setOnClickListener(v -> {
            finish();
        });
    }

    // Open the reusable purchase screen
    private void openPurchase(String name, int price, int image) {

        Intent intent = new Intent(male_list.this, example_purchase.class);

        intent.putExtra("PRODUCT_NAME", name);
        intent.putExtra("PRODUCT_PRICE", price);
        intent.putExtra("PRODUCT_IMAGE", image);

        startActivity(intent);
    }
}