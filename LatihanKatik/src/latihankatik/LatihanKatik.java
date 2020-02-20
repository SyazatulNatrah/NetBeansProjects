/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihankatik;

/**
 *
 * @author Asus
 */
public class LatihanKatik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input
        
        int weight = 45;
        double height = 1.50;
        
        //process
        double BMI = weight / (height * height);
        System.out.println ("your BMI IS" + BMI);
        
    }
    
}
