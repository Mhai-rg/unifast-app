package com.example.unifastapp.quarter2.practical_exam;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Gamad_FastFoodMenu {
    @Test
    //Fast food test template
    public void testFastFoodFlow() {
        StringBuilder automatedInput = new StringBuilder();
        System.out.println("--- GENERATING FAST FOOD TEST DATA ---");
        // Step 1: Order Burger as Combo (Nested option 1)
        automatedInput.append("1\n"); // Choose Order Burger
        automatedInput.append("1\n"); // Choose Combo upgrade
        // Step 2: Order Burger as Solo (Nested option 2)
        automatedInput.append("1\n"); // Choose Order Burger
        automatedInput.append("2\n"); // Choose Solo
        // Step 3: Order Fries option
        automatedInput.append("2\n"); // Choose Order Fries
        // Step 4: Exit system
        automatedInput.append("3\n"); // Choose Exit
        System.out.println("--- TEST DATA GENERATION COMPLETE ---\n");
        ByteArrayInputStream inputStream = new ByteArrayInputStream(automatedInput.toString().getBytes());
        Scanner scanner = new Scanner(inputStream);

        // Instantiates class and calls main menu loop
        Gamad_FastFoodMenu fastFoodSystem = new Gamad_FastFoodMenu();
        fastFoodSystem.start(scanner);
    }

    //main system/while loop and cases
    public void start(Scanner scanner) {
        boolean running = true;
        while (running) {
            System.out.println("\n=== FAST FOOD MENU ===");
            System.out.println("Choose an option: ");
            System.out.println("1. Order Burger");
            System.out.println("2. Order Fries");
            System.out.println("3. Exit");

            if (!scanner.hasNextInt()) {
                break;
            }

            int mainChoice = scanner.nextInt();

            switch (mainChoice) {
                case 1:
                    handleBurgerOrder(scanner);
                    break;
                case 2:
                    handleFriesOrder();
                    break;
                case 3:
                    System.out.println("Exiting fast food menu. Thank you!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
    //routing
    private void handleBurgerOrder(Scanner scanner) {
        System.out.println("\n--- Burger Menu ---");
        System.out.println("Choose burger option: ");
        System.out.println("1. Combo (Upgraded)");
        System.out.println("2. Solo");

        if (scanner.hasNextInt()) {
            int burgerChoice = scanner.nextInt();

            if (burgerChoice == 1) {
                System.out.println("You ordered a Burger Combo!");
            } else if (burgerChoice == 2) {
                System.out.println("You ordered a Solo Burger!");
            } else {
                System.out.println("Invalid option.");
            }
        }
    }
    private void handleFriesOrder() {
        System.out.println("\nYou ordered Fries!");
    }
}