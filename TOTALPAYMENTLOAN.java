/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totalpaymentloan;

/**
 *
 * @author Asus
 */
public class TOTALPAYMENTLOAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Nurfarahin binti Mohamad Zafir (261361)
        //Syazatul Natrah binti Abdul Rahman (261318)
        
        
        //p=amount loan
        //j= monthly interest
        //n= number of month
        //i= interest rate
        //l= length (in years)
        double i,j,l,n,p ;
        i = 2;
        j = i/ (12*100);
        l = 3;
        n = l * 12;
        p = 60000;
       double totalpaymentloan = p*(j/(1-(Math.pow(1+j,-n))));
       System.out.printf("The payment on a loan is RM %.2f\n",totalpaymentloan);     
        
  
    }
    
}
