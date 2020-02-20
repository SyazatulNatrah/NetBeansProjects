/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.*;
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int x = random.nextInt(100);
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Your name in upper case: ");
        System.out.println(name.toUpperCase());
        System.out.print("Your name in lower case: ");
        System.out.println(name.toLowerCase());
        
        System.out.println("The length of your name: " + name.length() + " character ");
        
        System.out.println("Your lucky number between (1-100): " + x );
        
    }
    
}
