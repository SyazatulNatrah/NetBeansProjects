/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labassignmentiv;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class LabAssignmentIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double totalSalary;
        String staffID;
        int hoursWorked;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Staff ID: ");
        staffID = scan.nextLine();
        
        System.out.print("Enter hours worked: ");
        hoursWorked = scan.nextInt();
        
        totalSalary = hoursWorked * 30;
        
        System.out.println("The Staff ID is: " + staffID);
        System.out.printf("Total Salary is RM %.2f\n", totalSalary);
    }
    
}
