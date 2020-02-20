/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

/**
 *
 * @author Asus
 */
public class Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=1; i<=10; i++)
            System.out.println("Loop value with for: "+i);
        
        int x=1;
        while (x<=10) {
            System.out.println("Loop value with while: "+x);
            x++;
        }
        
        int y=1;
        do {
            System.out.println("Loop with value do-while: "+y);
            y++;
        } while (y<=10);
    }
    
}
