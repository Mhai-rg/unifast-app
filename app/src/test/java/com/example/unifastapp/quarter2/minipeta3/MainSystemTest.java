package com.example.unifastapp.quarter2.minipeta3;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MainSystemTest {
    @Test
    public void main() {

        StringBuilder simulatedUserInput = new StringBuilder();

        System.out.println("--- GENERATING SIMULATED USER INPUTS ---");

        int interactionCount = 1;
        while (interactionCount <= 3) {
            System.out.println("Generating inputs for interaction #" + interactionCount);

            if (interactionCount == 1) {

                simulatedUserInput.append("1\n");
            } else if (interactionCount == 2) {

                simulatedUserInput.append("2\n");
                simulatedUserInput.append("300\n");
            } else {

                simulatedUserInput.append("2\n");
                simulatedUserInput.append("5000\n");
            }
            interactionCount++;
        }

        System.out.println("Generating inputs for specific features...");
        simulatedUserInput.append("1\n");    // E.g., Enter a specific sub-menu (like Settings or Combo Meals)
        simulatedUserInput.append("2\n");    // E.g., Choose an option inside that sub-menu
        simulatedUserInput.append("6767\n"); // E.g., Type a specific value (like a PIN or a quantity)
        simulatedUserInput.append("3\n");    // E.g., Go back to the Main Menu


        System.out.println("Generating input to Exit the system...");
        simulatedUserInput.append("4\n"); // Change '4' to whatever your Exit option is!

        System.out.println("--- INPUT GENERATION COMPLETE ---\n");


        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedUserInput.toString().getBytes());


        Scanner scanner = new Scanner(inputStream);

        Main mainSystem = new Main();
        mainSystem.start(scanner);
    }
}