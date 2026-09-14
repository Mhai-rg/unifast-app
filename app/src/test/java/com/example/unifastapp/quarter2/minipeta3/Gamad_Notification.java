package com.example.unifastapp.quarter2.minipeta3;

import org.junit.Test;

public class Gamad_Notification {
    @Test
    public void main() {

        boolean isReadyToPickUp = true;

        String notificationMessage = "Your order is ready for pickup. Please pick it up from the retail school store.";


        if (isReadyToPickUp) {
            System.out.println(notificationMessage);

        } else {
            System.out.println("Your order is currently on hold. Please wait.");
        }
    }
}
