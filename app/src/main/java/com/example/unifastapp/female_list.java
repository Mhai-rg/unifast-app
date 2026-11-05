package com.example.unifastapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class female_list extends AppCompatActivity {

    private final int femaleTopPrice = 367;
    private final int femaleSkirtPrice = 367;
    private final int peShirtPrice = 367;
    private final int pePantsPrice = 367;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_female_list);

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
        Button buttonFemaleTop = findViewById(R.id.buttonFemaleTop);
        Button buttonFemaleSkirt = findViewById(R.id.buttonFemaleSkirt);
        Button buttonPEShirt = findViewById(R.id.buttonPEShirt);
        Button buttonPEPants = findViewById(R.id.buttonPEPants);
        Button buttonBackHome = findViewById(R.id.buttonBackHome2);

        // Female Top
        buttonFemaleTop.setOnClickListener(v -> {
            openPurchase(
                    "Female Top",
                    femaleTopPrice,
                    R.mipmap.top_female_foreground
            );
        });

        // Female Skirt
        buttonFemaleSkirt.setOnClickListener(v -> {
            openPurchase(
                    "Female Skirt",
                    femaleSkirtPrice,
                    R.mipmap.female_skirt
            );
        });

        // P.E. Shirt
        buttonPEShirt.setOnClickListener(v -> {
            openPurchase(
                    "P.E. Shirt",
                    peShirtPrice,
                    R.mipmap.pe_uniform_female_foreground
            );
        });

        // P.E. Pants
        buttonPEPants.setOnClickListener(v -> {
            openPurchase(
                    "P.E. Pants",
                    pePantsPrice,
                    R.mipmap.pe_pants_foreground
            );
        });

        // Back Home
        buttonBackHome.setOnClickListener(v -> {
            finish();
        });
    }

    // Open Reusable Purchase Screen
    private void openPurchase(String name, int price, int image) {

        Intent intent = new Intent(
                female_list.this,
                example_purchase.class
        );

        intent.putExtra("PRODUCT_NAME", name);
        intent.putExtra("PRODUCT_PRICE", price);
        intent.putExtra("PRODUCT_IMAGE", image);

        startActivity(intent);
    }
}