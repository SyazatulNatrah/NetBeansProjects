/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.util.Scanner;
public class Hotel {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        double gardenView = 205.00;
        double poolView = 245.00;
        double lakeView = 300.00;
        double refrigerator = 25.00;
        double extraBedgarden = 60.00;
        double extraBedpool = 60.00;
        double extraBedlake = 80.00;
        double roomRate = 0;
        boolean refrig=false,bed=false;
        double refrigRate=80,bedRate=0;
        String roomType;
        double roomtypevalue;
        int numberDays;
        double roomtype;
        String alphabet;
        double price=0;
        String choose;
        String yes;
      
        alphabet = "";
        System.out.print("Enter room type (G-garden view; P-pool view; L-lake view;): ");
        roomType = input.next();
            
        
        switch (roomType) {
            case "G":
                alphabet = "Garden View room";
                price = price + gardenView;
                roomRate=price;
                break;
            case "P":
                alphabet = "Pool View room";
                price = price + poolView;
                roomRate=price;
                break;
            case "L":
                alphabet = "Lake View room";
                price = price + lakeView;
                roomRate=price;
                break;
            default:
                System.out.println("your input is wrong");
                break;
        }
        
        
        System.out.print("Enter number of day to stay: ");
        numberDays = input.nextInt();
        
        price = price * numberDays;
        
        
        System.out.print("Do you want refrigerator or not?: (yes or no) ");
        
        choose = input.next();
        
        if (choose.equals("yes") ){
            refrig=true;           
            price = price + refrigerator * numberDays;
        }    
        else 
        price = price;
        refrig=false; 
        
        System.out.print("Do you want extra bed? (yes or no) ");
        choose = input.next();

        
         if (choose.equals("yes")){
             bed=true;
             if (roomType == "G" || roomType== "P"){
             price = price+ 60 * numberDays;
              bedRate=60;
             } 
                  else {
                    price = price+ 80 * numberDays;
                    bedRate=80;
             
             }     
         }else {
              price = price;
         
         }
        
         
        System.out.println("**********************************************************");
        System.out.println ("Your booked a " + alphabet);  
        System.out.println("You stay for " + numberDays);
        System.out.println("Your room rate is RM" + roomRate);
        System.out.println("The daily charge for extra bed is RM"+bedRate);
        System.out.println("The daily charge for refrigerator is RM"+refrigerator);    
        System.out.println("Total charge for your stay is " + price);
        

        
        
        
    }
}
