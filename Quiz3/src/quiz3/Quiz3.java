/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3;

import java.util.*;
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner g3 = new Scanner(System.in);
        System.out.println("Enter a number of inputs that you want to enter: > ");
        int m3 = g3.nextInt();
        int num;
        int t3=0;
        System.out.println("\nThis app will accumulate odd numbers only.");
        System.out.println("The list of odd number are as follows:");
        for (int i=1; i<=m3; i++) {
            System.out.printf("%nEnter input number %d: > ", i);
            num = g3.nextInt();
            if (num%2!=0) {
                t3+=num;
                System.out.printf("%nYou enter %d. The summation of the odd number now is %d.%n", num,t3);
            } else
                System.out.println("You have entered an EVEN number. It will be skipped");
        }
        System.out.println("\nAll input you have been entered.");
        System.out.println("The total summation of odd numbers are "+t3);
    }
    
}
