/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmenti;

/**
 *
 * @author Asus
 */
import java.util.*;
public class AssignmentI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int firstmeter;
     int secondmeter;
     int UnitUsed;
     double totalamount;
     
     System.out.println("Enter the number of first meter: ");
     firstmeter = input.nextInt();
     System.out.println("Enter the number of second meter: ");
     secondmeter = input.nextInt();
     
     int UnitUsed = firstmeter + secondmeter ;
     System.out.println("Number of units used; " + (firstmeter + secondmeter ));
     
     if(UnitUsed >0 && <=20)
     {
         totalamount = UnitUsed * 0.40;
         System.out.printf("\tTotal Charge: RM %.2f", totalamount);
     }
     
     else if(UnitUsed >21 && <=40)
         {
         int = UnitUsed + 10;
             totalamount = (20 * 0.40) + (10 * 0.70);
             System.out.printf("\tTotal Charge: RM %.2f", totalamount);
         }
     }
    }
    

