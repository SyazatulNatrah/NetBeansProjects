/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodsii;

/**
 *
 * @author Asus
 */
public class MethodsII {

   public static void display1() {
       System.out.println("From Method display1 - Row 1");
       
   }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("From Method main - Line 1");
        display1();
        System.out.println("From Method main - Line 2");
        display2();
        
    }
    
    public static void display2(); {
    System.out.println("FROM Method display2 - LINE 1");
    display1();
}
    
}
