/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskweek6;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TaskWeek6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a, b;

a = 0;

Scanner in = new Scanner(System.in);

System.out.println("Please enter b: ");

b = in.nextInt();

if (b > 100)

{

   a = b;

}

else

{

   a = 0;

}

System.out.println("a: " + a);  

}
    }
    

