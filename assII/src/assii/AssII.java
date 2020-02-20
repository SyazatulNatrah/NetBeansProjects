/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assii;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class AssII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
        
        int hoursWork;
        int normalRate = 40;
        double regular, payRate, overtime, gross1, gross2 = 0, totalPayment, sum, counter = 0;
        char yesNo;
        char ans=0;
        char ans1;
        
        double [] rate = {3.50, 4.00, 4.50, 4.75, 5.00, 5.25, 5.50, 5.75, 6.00};
        
       
        
        System.out.print("Enter hours work: ");
        hoursWork = read.nextInt();
        System.out.print("Enter pay rate: ");
        payRate = read.nextDouble();
        System.out.print("Enter pay rate: ");
        payRate = read.nextDouble();
        System.out.print("Enter pay rate: ");
        payRate = read.nextDouble();
        
        regular = normalRate * payRate;
        overtime = (hoursWork - 40) * payRate * 1.5;
        gross1 = regular + overtime;
       
        
        System.out.println("Regular: "+regular);
        System.out.println("Overtime: "+overtime);
        System.out.println("Gross: "+gross1);
        
        /*System.out.print("Do you have any employee to process (Y/N): ");
        yesNo = read.next().charAt(0);
        counter++;*/
        
        System.out.print("Do you want to add? [Y/N]: ");
        ans=read.next().charAt(0);
 
        {
   if(ans=='Y'||ans=='y');
        System.out.print("Enter hours work: ");
        hoursWork = read.nextInt();
        System.out.print("Enter pay rate: ");
        payRate = read.nextDouble();
        System.out.print("Enter pay rate: ");
        payRate = read.nextDouble();
       
        
        regular = hoursWork * 5;
        overtime = (hoursWork - 40) * payRate * 1.5 * 0;
        gross2 = regular + overtime;
        
        System.out.println("Regular: "+regular);
        System.out.println("No overtime pay");
        System.out.println("Gross: "+gross2);
        
        if (ans=='N' || ans=='n');
        sum = gross1 + gross2;
        
        System.out.println("Total sum: "+sum);
        }
    }
}
  
       
    
    
    

