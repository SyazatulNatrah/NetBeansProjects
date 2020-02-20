/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseiv;

/**
 *
 * @author Asus
 */
import java.util.*;
public class ExerciseIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner readData = new Scanner(System.in);
    System.out.print("Please enter a number [LESS than 100] > ");
    int maks = readData.nextInt();
    System.out.println("\n=======================================\n");
    
    double total = 1;
    for (int i = 1; i<=maks; i+=2) {
        total *=i;
        System.out.print(i+"x");
    }
    System.out.println("1 ==> "+total);
    }
    
}
