package com.example.unifastapp.quarter2.minipeta3;

import org.junit.Test;
public class Montilano_Receipt {

    @Test

   public void main(){

    String customerName = "Jazz Montilano";
    String itemName = "uniform";
    String receiptNumber = "000067";
    String receiptDate = "07/10/26";

    double unitPrice = 567.00;
    int quantity = 2;
    double totalAmount = 567.00 * 2;
    double paymentAmount = 1134.00;

    System.out.println("Receipt Number: " + receiptNumber);
    System.out.println("Receipt Date: " + receiptDate);
    System.out.println("Customer Name: " + customerName);
    System.out.println("Item Name: " + itemName);
    System.out.println("Unit Price: " + unitPrice);
    System.out.println("Quantity: " + quantity);
    System.out.println("Total Amount: " + totalAmount);
    System.out.println("Payment Amount: " + paymentAmount);
   }
}
