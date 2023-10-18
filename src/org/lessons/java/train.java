package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class train {
    public static void main(String[] args) {

        double ticketPrice = 0.21;
        double discountMinors = 0.8; //discount di 20%
        double discountSeniors = 0.6; //discount di 40%
        double totalCost = 0;

        String pattern = "##.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

//      Istanzio lo scanner
        Scanner scan = new Scanner(System.in);

//      Il programma chiede all’utente il numero di chilometri che vuole percorrere
        System.out.print("Quanti km vui percorrere?");
        int kmToFind = scan.nextInt();

//      Il programma chiede all’utente la sua età
        System.out.print("Quanti Anni hai?");
        int ageToFind = scan.nextInt();

        if (ageToFind < 18) {
            totalCost = kmToFind*ticketPrice*discountMinors;
        } else if (ageToFind > 65) {
            totalCost = kmToFind*ticketPrice*discountSeniors;
        } else if (ageToFind > 18 && ageToFind < 65) {
            totalCost = kmToFind*ticketPrice;
        }
        System.out.println("the cost is " + decimalFormat.format(totalCost) + " €");
        
        
//      chiudo lo scanner
        scan.close();
    }
}
