package com.example.unifastapp.quarter2.practical_exam;

import java.io.ByteArrayInputStream;
import org.junit.Test;
import java.util.Scanner;

public class Miasco_LibraryKioskMenu {
    @Test
        public void start() {
            Scanner scanner = new Scanner(System.in);

            int choice;

            do {
                System.out.println("===== LIBRARY KIOSK =====");
                System.out.println("1. Borrow a Book");
                System.out.println("2. Return a Book");
                System.out.println("3. Search for a Book");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        borrowBook();
                        break;

                    case 2:
                        returnBook();
                        break;

                    case 3:
                        searchBook();
                        break;

                    case 4:
                        System.out.println("Thank you for using the Library Kiosk!");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } while (choice != 4);

            scanner.close();
        }

        private void borrowBook() {
            System.out.println("--- BORROW BOOK ---");
        }

        private void returnBook() {
            System.out.println("--- RETURN BOOK ---");
        }

        private void searchBook() {
            System.out.println("--- SEARCH BOOK ---");
        }
    }