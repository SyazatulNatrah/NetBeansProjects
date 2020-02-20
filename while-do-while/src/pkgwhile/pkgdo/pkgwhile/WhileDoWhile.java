/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile.pkgdo.pkgwhile;

/**
 *
 * @author Asus
 */
public class WhileDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int y = 10;
        do {
            System.out.println("Inside do-while loop");
            y++;
        } while (y<=5);
        System.out.println("End of do-while loop");
        
        int x=10;
        while (x<=5) {
            System.out.println("InsideWhile loop");
            x++;
        }
        System.out.println("End of while loop");
    }
    
}
