/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplier;

/**
 *
 * @author Asus
 */
import java.util.*;
public class Multiplier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int j, multiplier, mulResult;
    System.out.println("Enter the multiplier > ");
    Scanner getz = new Scanner(System.in);
    multiplier = getz.nextInt();
    
    System.out.println("Multiplication Table for "+multiplier);
    System.out.println("=========================\n");
    for (j=1; j<=12; j++) {
        mulResult = multiplier*j;
        System.out.printf("%d X %d = %d \n", multiplier, j, mulResult);
    }
    System.out.println("==========================");
    }
    }
    
