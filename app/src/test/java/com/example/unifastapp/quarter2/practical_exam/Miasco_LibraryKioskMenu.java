package com.example.unifastapp.quarter2.practical_exam;

import java.io.ByteArrayInputStream;
import org.junit.Test;
import java.util.Scanner;

public class Miasco_LibraryKioskMenu {
    @Test
    public void start() {

        // Main menu
        System.out.println("===== LIBRARY KIOSK =====");
        System.out.println("1. Borrow Book");
        System.out.println("2. Return Book");
        System.out.println("3. View Books");
        System.out.println("4. Exit");

        // Library cases
        borrowBook();
        returnBook();
        viewBooks();
    }

    private void borrowBook() {
        // Borrow book cases
        System.out.println("Borrow Book");
    }

    private void returnBook() {
        // Return book cases
        System.out.println("Return Book");
    }

    private void viewBooks() {
        // View books cases
        System.out.println("View Books");
    }
}