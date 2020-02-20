/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author Asus
 */
public class Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               /** The purpose of this program is to show an implicit
         * and explicit casting
         */
        
        //implicit casting
        final double PI = 3.14159;
        int radius = 4;
        
        /** In this mixed-type expression, PI is a double and radius is an int.
         * Therefore, radius is promoted (implicit casting) to a double (4.0)
         * Thus, the result of PI*radius*radius is a double
         * and stored in a double variable circleArea.
         */
        double circleArea = PI * radius * radius; 
        System.out.println("The circle area is " + circleArea);
        
        //Explicit casting 
        int totalMark = 385, count = 4;

        /* double average = (double) totalMark/count;
        * 1. (double) totalMark - convert totalMark to a double
        * 2. (double) totalMark/count - count is promoted to a double
        * 3. Thus the result of the division is a double
        */
        double average = (double) totalMark/count;
        System.out.println("The average test score " + average);
average = totalMark/count;
System.out.println("Test1: The average test score " + average);
average = (double) (totalMark/count);
System.out.println("Test2: The average test score " + average);

    }
    
}
