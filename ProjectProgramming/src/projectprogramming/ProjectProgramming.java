/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectprogramming;

import java.util.*;
public class ProjectProgramming {

    public static double thePrices;
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*****************************");
        System.out.println("WELCOME TO KOBIS BUNGA BAKERY");
        System.out.println("*****************************");
        
        char yesNo;
        int counter;
        counter = 1;
        do {
        
        Scanner read = new Scanner(System.in);
        String [] cakes = {"Pancake", "Fruit Cake", "CupCake", "Chocolate", "Cheesecake", "Paplova", "Brownies", "Red Velvet", "Hazel Nuts", "Black Forest"};
        double [] prices = {10.00, 12.50, 15.00, 20.00, 22.50, 25.00, 30.00, 35.00, 45.00, 45.50};
        
        for (int i=0; i<cakes.length; i++) {
            System.out.printf("%d) %-12s RM%6.2f %n", (i+1), cakes [i], prices [i]);
        }
        System.out.println("\n\nhi customer, which cake do you prefer? (state number of cakes) > ");
        int numCake = read.nextInt();
        System.out.println("State the quantity of cake that you want? ");
        int jumlah = read.nextInt();
        
        
        thePrices = thePrices+(prices[numCake-1] * jumlah);
        
        System.out.printf("Hi dear customer, the cake you choose is %s. %n", cakes [numCake-1]);
        System.out.printf("The price of the cake is RM%.2f %n", prices [numCake-1]);
        System.out.printf("Quantity of buying is %d. %n", jumlah);
        System.out.printf("Thus the total price is RM%.2f", thePrices);
        System.out.println("\nDo you want to add another order? 'Y'/'N' ");
        yesNo= read.next().charAt(0);
        counter ++;
        
        } while (yesNo=='Y' || yesNo == 'Y');
        do {
            System.out.println("the total of cake is :> " +thePrices);
        } while(thePrices<=2); {
        
    }
        double total;
        double amount;
        do while (total - amount);
        System.out.println("the amount tendered:> ");
}
    
       
        }
        
    
    

