/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimarket;

import java.util.*;
public class MiniMarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double totalAmount = 0, priceItem1, priceItem2 = 0, totalBefore, discount, totalDiscount;
        int quantityItem1 = 0, quantityItem2 = 0, numberItems;
        
        System.out.println("WELCOME TO CAS MINI MARKET !");
        System.out.println("------------------------------------------");
        
        System.out.println("Enter number of items purchased: ");
        numberItems = input.nextInt();
        
        System.out.println("Enter the price of item 1: ");
        priceItem1 = input.nextDouble();
        
        System.out.println("Enter the quantity of item 1: ");
        quantityItem1 = input.nextInt();
        
        System.out.println("Enter the price of item 2: ");
        priceItem2 = input.nextDouble();
        
        System.out.println("Enter the quantity of item 2: ");
        quantityItem2 = input.nextInt();
        
        if ((totalAmount >= 0 && totalAmount <=49))
            discount = totalAmount * 0.0; 
        else if ((totalAmount >= 50 && totalAmount <= 99))
            discount = totalAmount * 0.1;
        else if ((totalAmount >= 100 && totalAmount <= 149))
            discount = totalAmount * 0.15;
        else
                discount =  totalAmount * 0.2;
        
        totalBefore = (priceItem1 * quantityItem1) + (priceItem2 * quantityItem2);
        System.out.println("Total before discount: " + totalBefore);
        
        totalDiscount = (totalBefore * 0.2);
        System.out.println("Total discount: " + totalDiscount);
        
        totalAmount = totalBefore - totalDiscount;
        System.out.println("Total amount: " + totalAmount);
        
        
        
        
    }
    
}
