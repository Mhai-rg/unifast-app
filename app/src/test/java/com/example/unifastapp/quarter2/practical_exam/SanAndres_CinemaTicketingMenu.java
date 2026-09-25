package com.example.unifastapp.quarter2.practical_exam;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
public class SanAndres_CinemaTicketingMenu {
    @Test
    //CinemaTicketingTestTemplate
    public void testCinemaTicketingMenu() {
        StringBuilder automatedInput = new StringBuilder();
        System.out.println("--- GENERATING CINEMA TEST DATA ---");
        // Step 1: Test underage restriction (< 18)
        automatedInput.append("1\n");  // Choose Buy Ticket
        automatedInput.append("15\n"); // Enter age 15 → Expected: Access Denied
        // Step 2: Test legal age access (>= 18)
        automatedInput.append("1\n");  // Choose Buy Ticket
        automatedInput.append("20\n"); // Enter age 20 → Expected: Ticket Printed
        // Step 3: Test snack purchase
        automatedInput.append("2\n");  // Choose Buy Snacks
        // Step 4: Exit system
        automatedInput.append("3\n");  // Choose Exit
        System.out.println("--- TEST DATA GENERATION COMPLETE ---\n");
        ByteArrayInputStream inputStream = new ByteArrayInputStream(automatedInput.toString().getBytes());
        Scanner scanner = new Scanner(inputStream);
        CinemaMenu cinemaSystem = new CinemaMenu();
        cinemaSystem.start(scanner);
    }
}

    //main sytem/while loop and cases
    public void start(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("=== CINEMA MENU ===");
            System.out.println("1. Buy Ticket");
            System.out.println("2. Buy Snacks");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
        }
    }
            if(!scanner.hasNextInt()){
               break;
        }
        int msinChoice = scanner.nextInt();
        scanner.nextLine();

        switch (mainchoice) {
            case 1:
                handleBuyTicket(scanner);
                break;
            case 2:
                handleBuySnacks(scanner);
                break;
            case 3:
                System.out.println("Exiting system...");
                running = false;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    scanner.close();
}
















