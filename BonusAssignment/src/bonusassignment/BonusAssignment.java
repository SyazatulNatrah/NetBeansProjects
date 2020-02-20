/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonusassignment;

/**
 *
 * @author Asus
 */
 import java.util.*;
public class BonusAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner (System.in);
        System.out.println ("Enter a name of a day from MONDAY - THURSDAY > ");
        String day = read.nextLine();
        
        String WordBM = "" , WordArabic = "" ;
       if(day.equals("MONDAY") == true) {
       
            WordBM = "ISNIN" ;
            WordArabic = "الإثنين" ;
        }
        
        if(day.equals("TUESDAY") == true) {
        WordBM = "SELASA";
        WordArabic = "الثلاثاء";
        }
        
        if(day.equals ("WEDNESDAY")== true){
        WordBM = "RABU";
        WordArabic = "الأربعاء";
        }
        
        if (day.equals ("THURSDAY")== true) {
        WordBM = "KHAMIS";
        WordArabic = "الخميس";
        }
           
        System.out.printf("Your day in word : \nBM: %S \nArabic: %s ",WordBM ,WordArabic);
        }
    }
    

