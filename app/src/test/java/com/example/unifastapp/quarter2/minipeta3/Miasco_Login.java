package com.example.unifastapp.quarter2.minipeta3;

import org.junit.Test;

public class Miasco_Login {
    @Test
        public void main() {

            boolean IsReadyToLogin = true;

            // Stores username
            String username = "hersheymhaymiasco";

            // Stores password
            String password = "N0224";

            if (IsReadyToLogin) {
                System.out.println("Login Successful");
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
            } else {
                System.out.println("Login Failed");
            }
        }
    }