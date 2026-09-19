package com.example.unifastapp.quarter2.minipeta3;

import java.util.Scanner;
import org.junit.Test;
public class Main {
    @Test
    public void start(Scanner scanner) {
        boolean isRunning = true;

        System.out.println("=== WELCOME TO UNIFAST APP ===");

        while (isRunning && scanner.hasNextLine()) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Login");
            System.out.println("2. Process Transaction");
            System.out.println("3. Sub-Menu / Print Receipt");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    // 1. Miasco_Login
                    boolean isReadyToLogin = true;
                    String username = "hersheymhaymiasco";
                    String password = "N0224";

                    if (isReadyToLogin) {
                        System.out.println("\n--- LOGIN STATUS ---");
                        System.out.println("Login Successful");
                        System.out.println("Username: " + username);
                        System.out.println("Password: " + password);
                    } else {
                        System.out.println("Login Failed");
                    }
                    break;

                case "2":
                    // 2. SanAndres_Transaction
                    int transactionID = 1001;
                    double transactionAmount = 500.00;

                    if (scanner.hasNextLine()) {
                        String inputAmount = scanner.nextLine().trim();
                        try {
                            transactionAmount = Double.parseDouble(inputAmount);
                        } catch (NumberFormatException ignored) {}
                    }

                    String transactionDate = "July 8, 2026";
                    Boolean transactionStatus = true;

                    System.out.println("\n--- TRANSACTION DETAILS ---");
                    System.out.println("Transaction ID: " + transactionID);
                    System.out.println("Transaction Amount: ₱" + transactionAmount);
                    System.out.println("Transaction Date: " + transactionDate);
                    System.out.println("Transaction Status: " + (transactionStatus ? "Completed" : "Pending"));
                    break;

                case "3":
                    if (scanner.hasNextLine()) scanner.nextLine();
                    if (scanner.hasNextLine()) scanner.nextLine();
                    if (scanner.hasNextLine()) scanner.nextLine();

                    // 3. Montilano_Receipt
                    String customerName = "Jazz Montilano";
                    String itemName = "uniform";
                    String receiptNumber = "000067";
                    String receiptDate = "07/10/26";

                    double unitPrice = 567.00;
                    int quantity = 2;
                    double totalAmount = unitPrice * quantity;
                    double paymentAmount = 1134.00;

                    System.out.println("\n--- RECEIPT ---");
                    System.out.println("Receipt Number: " + receiptNumber);
                    System.out.println("Receipt Date: " + receiptDate);
                    System.out.println("Customer Name: " + customerName);
                    System.out.println("Item Name: " + itemName);
                    System.out.println("Unit Price: " + unitPrice);
                    System.out.println("Quantity: " + quantity);
                    System.out.println("Total Amount: " + totalAmount);
                    System.out.println("Payment Amount: " + paymentAmount);

                    // 4. Gamad_Notification
                    boolean isReadyToPickUp = true;
                    String notificationMessage = "Your order is ready for pickup. Please pick it up from the retail school store.";

                    System.out.println("\n--- NOTIFICATION ---");
                    if (isReadyToPickUp) {
                        System.out.println(notificationMessage);
                    } else {
                        System.out.println("Your order is currently on hold. Please wait.");
                    }
                    break;

                case "4":
                    System.out.println("\nExiting System. Goodbye!");
                    isRunning = false;
                    break;

                default:
                    break;
            }
        }
    }
}