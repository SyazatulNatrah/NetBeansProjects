/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexer4;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class LabExer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double priceMeal;
        double salesTax = 8.25/100;
        double amountTendered = 0.0;
        double totalAmount;
        double changeCash;
        double discount = 0;
        
        System.out.println(" **** Pizza House ****** ");
        System.out.println("Enter the price of meal: ");
        priceMeal = scan.nextDouble();
        if (priceMeal > 100.00)
        discount = priceMeal * 5/100;
        else if (priceMeal > 200)
           discount = priceMeal * 10/100;
        System.out.printf("The discount for the priceMeal %.2f is %.2f: ", priceMeal, discount);
        totalAmount = priceMeal * salesTax;
        System.out.println("Please enter the sales tax: ");
        salesTax = scan.nextDouble();
        System.out.println("-------------------------------");
        totalAmount = priceMeal + salesTax;
        System.out.println("Total amount : "+ totalAmount);
        
        System.out.println("Enter the amount tendered: ");
        
        System.out.println("Please enter the amount tendered: ");
        amountTendered = scan.nextDouble();
         System.out.println("-------------------------------");
         changeCash = amountTendered - totalAmount;
         System.out.println("Change Cash: " + changeCash);
         System.out.println(" **** Thank You ***** ");

    }
    
}
