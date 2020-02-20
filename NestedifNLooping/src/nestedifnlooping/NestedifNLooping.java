/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedifnlooping;

/**
 *
 * @author Asus
 */
import java.util.*;
public class NestedifNLooping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner read = new Scanner(System.in);
      System.out.println("Enter a number");
      int num = read.nextInt();
      
      if(num > 0)
      {
          if(num%2==0)
              System.out.println("Even Number");
          else
              System.out.println("Odd Number");
          
      }
    }
    
}
