/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodninja;

import java.util.*;
public class FoodNinja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String id[] = new String[10];
        String staff_name[] = new String[10];
        String salary[] = new String[10];
        String branch[] = new String[10];
        
        for(int i = 0; i < 10; i++){
            System.out.print("Enter ID: ");
            id[i] = scanner.nextLine();
            System.out.print("Enter Staff Name: ");
            staff_name[i] = scanner.nextLine();
            System.out.print("Enter Salary: ");
            salary[i] = scanner.nextLine();
            System.out.print("Enter Branch: ");
            branch[i] = scanner.nextLine();
        }
        for(int i = 0; i < 10; i++){
            System.out.println("ID : " + id[i]);
            System.out.println("Staff Name : " + staff_name[i]);
            System.out.println("Salary : " + salary[i]);
            System.out.println("Branch : " + branch[i]);
        }
    }
    
}
