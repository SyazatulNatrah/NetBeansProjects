/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Asus
 */
import java.util.*;
public class Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner getz = new Scanner(System.in);
        System.out.println("Enter your weight(in KG)>");
        int w = getz.nextInt();
        System.out.println("Enter your height (in Meter)>");
        double h = getz.nextDouble();
        double bmi = (w/h*h);
        
        if (bmi<18.5)
            System.out.printf("Your bmi value is %.2f, you are UNDERWEIGHT", bmi);
        if (bmi>=18.5 && <24.5)
            System.out.printf("Your bmi value is %.2f, you are NORMAL", bmi);
        if (bmi>24.5)
            System.out.printf("Your bmi value is %.2f, ypu are (OVERWEIGHT)!\n\n",bmi);
    }
    
}
