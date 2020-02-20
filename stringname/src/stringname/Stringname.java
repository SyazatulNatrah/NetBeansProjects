/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringname;

/**
 *
 * @author Asus
 */
 import java.util.Scanner;
public class Stringname {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println ("Please enter your name > ");
        String name = input.nextLine();
        
        System.out.println ("your name is  " + name);
    }
    
}
