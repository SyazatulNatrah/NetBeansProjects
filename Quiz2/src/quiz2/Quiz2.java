/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

import java.util.*;
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner g = new Scanner(System.in);
        System.out.println("Enter a number: >");
        int m = g.nextInt();
        do {
            if (m%5==0)
                System.out.printf("You enter %d. This number CAN be divided by 5.%n", m);
            else
                System.out.printf("You enter %d. This number CAN NOT be divided by 5.%n", m);
            
            System.out.println("\nEnter a number: (enter 0 to stop) > ");
            m = g.nextInt();
        } while (m>0);
        System.out.println("\nYou have entered 0. Good Bye.");
    }
    
}
