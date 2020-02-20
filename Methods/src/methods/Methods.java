/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author Asus
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("From Method main - Line 1");
        display();
        System.out.println("From Method main - Line 2");
        System.out.println("From Method main - Line 3");
        display();
    }
    
    public static void display() {
        System.out.println("From Method display - Row 1");
        System.out.println("From Method display - Row 2");
    }
}
