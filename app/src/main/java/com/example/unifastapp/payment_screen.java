package com.example.unifastapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class payment_screen extends AppCompatActivity {

    private ImageView imgGcash;
    private ImageView imgSelectedPreview;
    private TextView tvTitle;

    private EditText etNumber, etOtp, etMpin, etCard, etCardNumber, etExpirationDate, etCcv, etCardholderName;
    private Button btnProceed;

    private String selectedMethod = "GCash";
    private String productName;
    private String productSize;
    private int quantity;
    private int totalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_payment);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Receive order details from the previous screen (if any)
        Intent incomingIntent = getIntent();
        if (incomingIntent != null) {
            productName = incomingIntent.getStringExtra("PRODUCT_NAME");
            productSize = incomingIntent.getStringExtra("PRODUCT_SIZE");
            quantity = incomingIntent.getIntExtra("PRODUCT_QUANTITY", 1);
            totalAmount = incomingIntent.getIntExtra("TOTAL_AMOUNT", 0);
        }

        // Bind views from activity_payment.xml
        tvTitle = findViewById(R.id.textView21);
        imgGcash = findViewById(R.id.imgGcash);
        imgSelectedPreview = findViewById(R.id.imageView37);

        etNumber = findViewById(R.id.etNumber);
        etOtp = findViewById(R.id.etOtp);
        etMpin = findViewById(R.id.etMpin);
        etCard = findViewById(R.id.etCard);
        etCardNumber = findViewById(R.id.etCardNumber);
        etExpirationDate = findViewById(R.id.etExpirationDate);
        etCcv = findViewById(R.id.etCcv);
        etCardholderName = findViewById(R.id.etCardholderName);

        btnProceed = findViewById(R.id.btnProceed);

        // Display total amount in the title if an amount was passed
        if (tvTitle != null && totalAmount > 0) {
            tvTitle.setText("Pay ₱" + totalAmount);
        }

        // Select GCash option
        if (imgGcash != null) {
            imgGcash.setOnClickListener(v -> {
                selectedMethod = "GCash";
                if (imgSelectedPreview != null) {
                    imgSelectedPreview.setImageResource(R.mipmap.cash_foreground);
                }
                Toast.makeText(this, "Selected: GCash", Toast.LENGTH_SHORT).show();
            });
        }

        // Handle Proceed button click
        btnProceed.setOnClickListener(v -> processPayment());
    }

    private void processPayment() {
        String number = etNumber.getText().toString().trim();
        String otp = etOtp.getText().toString().trim();
        String mpin = etMpin.getText().toString().trim();
        String card = etCard.getText().toString().trim();
        String cardNumber = etCardNumber.getText().toString().trim();
        String expDate = etExpirationDate.getText().toString().trim();
        String ccv = etCcv.getText().toString().trim();
        String cardholder = etCardholderName.getText().toString().trim();

        if (!validateField(etNumber, number, "Please enter your number")) return;
        if (!validateField(etOtp, otp, "Please enter the OTP")) return;
        if (!validateField(etMpin, mpin, "Please enter your MPIN")) return;
        if (!validateField(etCard, card, "Please enter the card type")) return;
        if (!validateField(etCardNumber, cardNumber, "Please enter the card number")) return;
        if (!validateField(etExpirationDate, expDate, "Please enter the expiration date (MM/YY)")) return;
        if (!validateField(etCcv, ccv, "Please enter the CCV")) return;
        if (!validateField(etCardholderName, cardholder, "Please enter the cardholder name")) return;

        String summary = "Payment Confirmed (" + selectedMethod + ")"
                + (totalAmount > 0 ? "\nTotal: ₱" + totalAmount : "")
                + "\nCardholder: " + cardholder;

        Toast.makeText(this, summary, Toast.LENGTH_LONG).show();
    }

    private boolean validateField(EditText editText, String value, String errorMessage) {
        if (TextUtils.isEmpty(value)) {
            editText.setError(errorMessage);
            editText.requestFocus();
            return false;
        }
        return true;
    }
}