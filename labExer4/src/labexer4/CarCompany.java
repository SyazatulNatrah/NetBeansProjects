/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexer4;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class CarCompany {
    public static void main (String [] args) {
        
        Scanner input = new Scanner (System.in);
        
        int rentalCode;
        String name;
        String address;
        double phoneNumber;
        double licenseNumber;
        double date;
        int hoursRental;
        double price;
        
      System.out.print ("Enter rental code");
      rentalCode = input.nextInt();
      
      System.out.println ("RENTAL INFORMATION");
      System.out.println ("*****************************");
      System.out.print ("Enter customer's name : ");
      input.nextInt(); 
    }
}
