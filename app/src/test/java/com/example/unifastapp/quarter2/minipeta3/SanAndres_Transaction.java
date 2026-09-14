package com.example.unifastapp.quarter2.minipeta3;

import org.junit.Test;
public class SanAndres_Transaction {
    @Test
    public void main() {

        int transactionID = 1001;

        // Stores the transaction amount
        double transactionAmount = 500.00;

        // Records the transaction date
        String transactionDate = "July 8, 2026";

        // Shows the transaction status
        Boolean transactionStatus = true;

        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Transaction Amount: ₱" + transactionAmount);
        System.out.println("Transaction Date: " + transactionDate);
        System.out.println("Transaction Status: " + (transactionStatus ? "Completed" : "Pending"));
    }
}
