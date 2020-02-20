/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nana;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Nana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        
        int rentalCode;
        String name;
        String address;
        double phoneNumber;
        double licenseNumber;
        double date;
        int hoursRental;
        double price;
        
      System.out.print ("Enter rental code: ");
      rentalCode = input.nextInt();
      
      System.out.println ("RENTAL INFORMATION");
      System.out.println ("*****************************");
      
      System.out.print("Name: "); 
        name = input.next();
        input.nextLine(); 
        
      System.out.print("Address: ");
      address = input.nextLine();
    }
    
}
