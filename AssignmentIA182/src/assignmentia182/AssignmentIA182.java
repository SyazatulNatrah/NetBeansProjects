/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentia182;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class AssignmentIA182 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//declaration 

int rentalCode;
String name;
String address;
String phoneNumber;
String licenseNumber;
String date;
int hoursRental;
int daysRental;
double price=0;
char ans=0;
char ans1;


Scanner input = new Scanner(System.in);
do {
   do {
   
//input 
System.out.print ("Enter rental code : ");
rentalCode = input.nextInt();
if(rentalCode<1 || rentalCode>3)
  System.out.println("INVALID RENTAL CODE");
  }
  while(rentalCode<1 || rentalCode>3);
  input.nextLine();

System.out.println ("Enter customer's name :");
name= input.next();
input.nextLine();

System.out.println ("Enter customer's address : ");
address = input.nextLine();

System.out.println ("Enter phone number : ");
phoneNumber = input.nextLine();

System.out.println ("Enter license number : ");
licenseNumber = input.nextLine();

System.out.println ("Enter rental date : ");
date = input.nextLine();

System.out.println ("Enter the number of hours for car rental : ");
hoursRental = input.nextInt();


 //process
  switch(rentalCode){
   case 1:System.out.print("Enter the number of day for car rental:");
          hoursRental = input.nextInt();
          price = 10;
          if(hoursRental>1)
           price = 10 * (hoursRental-1); break;
   case 2:System.out.print("Enter the number of day for car rental:");
          daysRental = input.nextInt();
          price = 150*daysRental; break;
   case 3:price = 2000; break;
   default:System.out.println("Invalid rental code!");
   }
   
//output
System.out.println("RENTAL INFORMATION");
System.out.println("****");
System.out.println("Name           :" + name);
System.out.println("Address        :" + address);
System.out.println("Phone Number   :" + phoneNumber);
System.out.println("License Number :" + licenseNumber);
System.out.println("Rental date    :" + date);
System.out.println("Rental price   :" +price);
   
System.out.print("Do you want to add? [Y/N]");
ans=input.next().charAt(0);
 
}//end do
   while(ans=='Y'||ans=='y');
   if (ans=='N'||ans=='n')
   System.out.println("Thank you!");
   else
   System.out.println("you are enter wrong");
    }
    
}
