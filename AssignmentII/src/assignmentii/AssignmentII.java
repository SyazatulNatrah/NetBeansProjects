/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentii;

import java.util.*;
public class AssignmentII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int hoursWork;
        int normalRate = 40;
        double regular, payRate, overtime, gross, totalPayment, sum, counter = 0;
        char yesNo;
        
        double [] rate = {3.50, 4.00, 4.50, 4.75, 5.00, 5.25, 5.50, 5.75, 6.00};
        
        int employee [] = null;
        System.out.println(employee[0]);
        
        
      //int [] payRate = {3.50, 4.00, 4.50, 4.75, 5.00, 5.25, 5.50, 5.75, 6.00};
        
        System.out.print("Enter hours work: ");
        hoursWork = read.nextInt();
        System.out.print("Enter pay rate: ");
        payRate = read.nextDouble();
        System.out.print("Enter pay rate: ");
        payRate = read.nextDouble();
        System.out.print("Enter pay rate: ");
        payRate = read.nextDouble();
        
        regular = normalRate * payRate;
        overtime = (hoursWork - 40) * payRate;
        gross = regular + overtime;
        sum = gross + gross;
        
        System.out.println("Regular: "+regular);
        System.out.println("Overtime: "+overtime);
        System.out.println("Gross: "+gross);
        
        System.out.print("Do you have any employee to process (Y/N)");
        yesNo = read.next().charAt(0);
        counter++;
    }
       /* static int search (int [] num, int searchValue){
            int location = 0;
            for (i=0; i<num.length; i++)
                if (num[i]== searchValue)
                    location = i;
            return location;
            /*
        }
        
    /*} while (yesNo =='Y'|| yesNo == 'Y');
    do {
        System.out.println("Sum of the gross salaries of the employees: "+sum);
    */    
        
       
    }
    

