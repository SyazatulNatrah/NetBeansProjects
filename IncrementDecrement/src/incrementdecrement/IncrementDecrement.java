/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementdecrement;

/**
 *
 * @author Asus
 */
public class IncrementDecrement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int a = 6;
        System.out.println("Initially a is " + a);
        System.out.println("Pre-increment, a = " + ++a);
int b = 3;
System.out.println("Initially b is " + b);
System.out.println("Post-increment, so b = " + b++);
int c = 5;
c += 2;
System.out.println("c is " + c);
int d = 2;
d *= 2; 
System.out.println("d is " + d);
int e = 6;
e -= 2;
System.out.println("e is " + e);
int f = 8;
f /= 2;
System.out.println("f is " + f);
int g = 9;
g %= 2;
System.out.println("g is " + g);


    }
    
}
