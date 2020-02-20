/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imno1foru;

/**
 *
 * @author Asus
 */
 import java.util.Scanner;
public class Imno1foru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner badannat = new Scanner (System.in);
        System.out.println ("Please enter your nom1");
        int nom1 = badannat.nextInt();
        
        System.out.println ("Please enter your nom2");
        int nom2 = badannat.nextInt ();
        
        double integer = (double)nom1/(double)nom2 ;
        System.out.printf ("your integer num is %.2f\n",integer);
    }
    
}
