package com.example.unifastapp.quarter2.practical_exam;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Montilano_GymAccessTest {
    @Test
    public void testGymFlow() {
        StringBuilder automatedInput = new StringBuilder();
        System.out.println("--- GENERATING GYM TEST DATA ---");
// Step 1: Enter gym floor option
        automatedInput.append("1\n"); // Choose Enter Gym
// Step 2: Test VIP membership tier (Level 1)
        automatedInput.append("2\n"); // Choose Hire Trainer
        automatedInput.append("1\n"); // Enter level 1 (Expected: Trainer Assigned)
// Step 3: Test Basic membership tier (Level 2)
        automatedInput.append("2\n"); // Choose Hire Trainer
        automatedInput.append("2\n"); // Enter level 2 (Expected: Upgrade Required)
// Step 4: Exit system
        automatedInput.append("3\n"); // Choose Exit
        System.out.println("--- TEST DATA GENERATION COMPLETE ---\n");
        ByteArrayInputStream inputStream = new ByteArrayInputStream(automatedInput.toString().getBytes());
        Scanner scanner = new Scanner(inputStream);

        // Instantiates class and calls main menu loop
        Montilano_GymAccessTest gymSystem = new Montilano_GymAccessTest();
        gymSystem.start(scanner);
    }
}

public void start(Scanner scanner) {

    boolean running = true;

    while (running) {

        System.out.println("=== GYM ACCESS SYSTEM ===");
        System.out.println("1. Enter Gym");
        System.out.println("2. Hire Trainer");
        System.out.println("3. Exit");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                enterGym();
                break;

            case 2:
                hireTrainer(scanner);
                break;

            case 3:
                System.out.println("Exiting system...");
                running = false;
                break;

            default:
                System.out.println("Invalid choice.");

        }

    }
}

private void enterGym() {

}

private void hireTrainer(Scanner scanner) {

}

 }



