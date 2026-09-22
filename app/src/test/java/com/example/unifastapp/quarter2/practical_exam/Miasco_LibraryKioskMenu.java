package com.example.unifastapp.quarter2.practical_exam;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Miasco_LibraryKioskMenu {

    // Kiosk application method
    public void startKiosk(Scanner scanner) {
        System.out.println("--- LIBRARY KIOSK STARTED ---");
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            System.out.println("Processing selection: " + input);
        }
        System.out.println("--- KIOSK SESSION COMPLETED ---");
    }

    @Test
    public void testKioskWorkflow() {
        StringBuilder simulatedInputs = new StringBuilder();

        System.out.println("=== INITIALIZING KIOSK SIMULATION ===");

// Option 1: Search for a book title
        simulatedInputs.append("1\n");
        simulatedInputs.append("Java Programming\n");

// Option 2: Reserve a book
        simulatedInputs.append("2\n");
        simulatedInputs.append("BK-104\n");

// Option 3: Exit
        simulatedInputs.append("3\n");

        System.out.println("=== SIMULATION INPUTS READY ===\n");

// Convert inputs to InputStream for Scanner
        ByteArrayInputStream testInput = new ByteArrayInputStream(simulatedInputs.toString().getBytes());
        Scanner scanner = new Scanner(testInput);

// Execute kiosk with simulated inputs
        startKiosk(scanner);
    }
}