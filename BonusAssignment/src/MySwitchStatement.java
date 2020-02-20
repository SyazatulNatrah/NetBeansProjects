/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
import java.util.*;
public class MySwitchStatement {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner read = new Scanner (System.in);
        System.out.println("Enter a number between 1-3: > ");
        int num = read.nextInt ();
        
        switch (num) {
            case 1 :
                System.out.println ("SATU");
                System.out.println ("ONE");
                break;
                
            case 2 :
                System.out.println ("DUA");
                System.out.println ("TWO");
                break;
            
            case 3 :
                System.out.println ("TIGA");
                System.out.println ("THREE");
                break;
                
            default:
                System.out.println ("INVALID INPUT");
                break;
        }
        
        
        
        
    }
    
}