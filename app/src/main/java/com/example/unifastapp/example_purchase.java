package com.example.unifastapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class example_purchase extends AppCompatActivity {

    // Product Information
    private int productPrice;
    private String productName;
    private int productImage;

    // Quantity
    private int quantity = 1;

    // Views
    private TextView quantityNumber;
    private TextView totalPrice;

    private Button buttonIncrease;
    private Button buttonDecrease;
    private Button buttonConfirmPurchase;
    private Button buttonBack;

    private RadioGroup sizeRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_example_purchase);

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

        // Receive Product Information
        productName = getIntent().getStringExtra("PRODUCT_NAME");
        productPrice = getIntent().getIntExtra("PRODUCT_PRICE", 0);
        productImage = getIntent().getIntExtra("PRODUCT_IMAGE", 0);

        // Connect Product Views
        TextView productNameView = findViewById(R.id.textView2);
        TextView productPriceView = findViewById(R.id.textView3);
        ImageView productImageView = findViewById(R.id.imageView10);

        // Display Selected Product
        if (productName != null) {
            productNameView.setText(productName);
        }

        productPriceView.setText("₱" + productPrice);

        if (productImage != 0) {
            productImageView.setImageResource(productImage);
        }

        // Connect Quantity and Total Views
        quantityNumber = findViewById(R.id.quantityNumber);
        totalPrice = findViewById(R.id.totalPrice);

        // Connect Buttons
        buttonIncrease = findViewById(R.id.buttonIncrease);
        buttonDecrease = findViewById(R.id.buttonDecrease);
        buttonConfirmPurchase = findViewById(R.id.buttonConfirmPurchase);
        buttonBack = findViewById(R.id.buttoninsplashscreen2);

        // Connect Size RadioGroup
        sizeRadioGroup = findViewById(R.id.sizeRadioGroup);

        // Display Initial Values
        updateTotalPrice();

        // Increase Quantity
        buttonIncrease.setOnClickListener(v -> {
            quantity++;
            updateTotalPrice();
        });

        // Decrease Quantity
        buttonDecrease.setOnClickListener(v -> {
            if (quantity > 1) {
                quantity--;
                updateTotalPrice();
            } else {
                Toast.makeText(
                        example_purchase.this,
                        "Minimum quantity is 1",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        // Confirm Purchase
        buttonConfirmPurchase.setOnClickListener(v -> {

            // Check if Size is Selected
            int selectedId = sizeRadioGroup.getCheckedRadioButtonId();

            if (selectedId == -1) {
                Toast.makeText(
                        example_purchase.this,
                        "Please select a size first!",
                        Toast.LENGTH_SHORT
                ).show();

                return;
            }

            // Get Selected Size
            RadioButton selectedSize = findViewById(selectedId);
            String size = selectedSize.getText().toString();

            // Calculate Total
            int total = productPrice * quantity;

            // Show Confirmation
            Toast.makeText(
                    example_purchase.this,
                    "Purchase Confirmed!\n"
                            + "Product: " + productName + "\n"
                            + "Size: " + size + "\n"
                            + "Quantity: " + quantity + "\n"
                            + "Total: ₱" + total,
                    Toast.LENGTH_LONG
            ).show();
        });

        // Back Button
        buttonBack.setOnClickListener(v -> {
            finish();
        });
    }

    // Update Total Price
    private void updateTotalPrice() {

        int total = productPrice * quantity;

        quantityNumber.setText(String.valueOf(quantity));
        totalPrice.setText("₱" + total);
    }
}