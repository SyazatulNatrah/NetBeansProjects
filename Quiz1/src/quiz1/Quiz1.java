/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import java.util.*; 
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner g2 = new Scanner(System.in);
        System.out.println("Enter a number (with decimal point): > ");
        double m2 = g2.nextDouble();
        double tt=0;
        while (m2!=999) {
            tt+=m2;
            System.out.printf("You enter %.2f. The summation of the number now is %.2f.%n", m2, tt);
            Scanner g= new Scanner(System.in);
            System.out.println("\nEnter a number: (enter 999 to stop) > ");
            m2 = g2.nextDouble();
        }
        System.out.printf("\nYou have entered 999. The total summation is %.2f", tt);
    }
    
}
