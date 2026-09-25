package com.example.unifastapp.quarter2;

import org.junit.Test;

public class Gamad_MiniPeta1 {
    @Test
    public void printMyProfile() {

        String myName = "Gamad";
        String petName = "Candie";
        String favFood = "Matcha";
        int myAge = 16;

        System.out.println("--- MY DIGITAL PROFILE ---");
        System.out.println("Hello, my name is " + myName + " and I am " + myAge + " years old.");
        System.out.println("I have a wonderful pet named " + petName + ".");
        System.out.println("If I could, I would eat " + favFood + " every single day!");
    }
}