package com.example.unifastapp.quarter2.minipeta3;

import org.junit.Test;
import java.util.Scanner;

public class Main {
    @Test
    public void start(Scanner scanner) {
        boolean isReadyToLogin = true;

        String username = "hersheymhaymiasco";

        String password = "N0224";

        if (isReadyToLogin) {
            System.out.println("Login Successful");
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        } else {
            System.out.println("Login Failed");
        }

        int transactionID = 1001;

        double transactionAmount = 500.00;

        String transactionDate = "July 8, 2026";

        Boolean transactionStatus = true;

        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Transaction Amount: ₱" + transactionAmount);
        System.out.println("Transaction Date: " + transactionDate);
        System.out.println("Transaction Status: " + (transactionStatus ? "Completed" : "Pending"));

        String customerName = "Jazz Montilano";
        String itemName = "uniform";
        String receiptNumber = "000067";
        String receiptDate = "07/10/26";

        double unitPrice = 567.00;
        int quantity = 2;
        double totalAmount = unitPrice * quantity;
        double paymentAmount = 1134.00;

        System.out.println("Receipt Number: " + receiptNumber);
        System.out.println("Receipt Date: " + receiptDate);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Item Name: " + itemName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Payment Amount: " + paymentAmount);

        boolean isReadyToPickUp = true;

        String notificationMessage = "Your order is ready for pickup. Please pick it up from the retail school store.";

        if (isReadyToPickUp) {
            System.out.println(notificationMessage);
        } else {
            System.out.println("Your order is currently on hold. Please wait.");
        }
    }
}