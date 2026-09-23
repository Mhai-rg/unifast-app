package com.example.unifastapp.quarter2.practical_exam;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Gamad_FastFoodMenu {
    @Test
    public void start(Scanner scanner) {
        boolean running = true;
        while (running) {
            System.out.println("\n=== FAST FOOD MENU ===");
            System.out.println("1. Order Burger");
            System.out.println("2. Order Fries");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
        }
    }
    private void handleBurgerOrder(Scanner scanner) {
        // burger cases
    }
    private void handleFriesOrder() {
        // fries cases
    }
}
