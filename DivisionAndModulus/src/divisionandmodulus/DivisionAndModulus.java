/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisionandmodulus;

/**
 *
 * @author Asus
 */
public class DivisionAndModulus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /** The purpose of this program is to show the difference between
         * a division (/) operator and a modulus (%) operator
         */

        final int FIVE_CENTS = 5;
        int cents = 158;
        
        // How many 5 cents coins is in 158 cents? 
        int number_of_5cents = cents/FIVE_CENTS;
        System.out.println("There are " + number_of_5cents + " 5-cents coins in "
                + cents); 
  
        //How many cents are the leftover?
        int balance = cents%FIVE_CENTS;
        System.out.println("There are " + balance + " cents left");
final double MONTHS_IN_YEAR = 12;
double annualComission = 10233.0;
double monthlyComission = annualComission/MONTHS_IN_YEAR;
System.out.println("Monthly Comission: " + monthlyComission);
        
double surplus = monthlyComission%MONTHS_IN_YEAR;
System.out.println("Surplus: " + surplus);

    }
    
}
