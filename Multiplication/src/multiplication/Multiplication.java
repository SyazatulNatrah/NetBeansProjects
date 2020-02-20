/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplication;

/**
 *
 * @author Asus
 */
public class Multiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int j, mulResult;
        System.out.println("Multiplication Table for 9");
        System.out.println("==========================\n");
        for (j=1; j<=12; j++) {
            mulResult = 9*j;
            System.out.printf("9 X %d = %d \n", j, mulResult);
        }
    }
    
}
