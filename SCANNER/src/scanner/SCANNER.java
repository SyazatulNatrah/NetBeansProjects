/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

/**
 *
 * @author Asus
 */
 import java.util.Scanner;
public class SCANNER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner (System.in);
        System.out.println ("please enter your fahrenheit");
        
        double temperature = read.nextInt();
        double fahrenheit = 1.8*temperature + 32;
        System.out.println("your temperature is"+fahrenheit);
        
        
    }
    
}
