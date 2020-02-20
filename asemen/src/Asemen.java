import java.util.Scanner;
public class Asemen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double gardenView = 205.00;
        double poolView = 245.00;
        double lakeView = 300.00;
        double refrigerator = 25.00;
        double extraBedgarden = 60.00;
        double extraBedpool = 60.00;
        double extraBedlake = 80.00;
        double roomRate = 0;
        String roomType;
        int numberDays;
        double roomtype;
        String alphabet;
        double price=0;
        String choose;
        String yes;
        
        System.out.print("Enter room type (G-garden view; P-pool view; L-lake view;): ");
        roomType = input.next();
            
        alphabet = "";
        if (roomType.equals("G") == true) {
        alphabet = "Garden View room";
        price = price + gardenView;
        }
        
        else if (roomType.equals ("P") == true) {
        alphabet = "Pool View room";
        price = price + poolView;
        }
        
        else if  (roomType.equals("L") == true){
        alphabet = "Lake View room";
        price = price + lakeView;

        }
        
        else 
        System.out.println("your input is wrong");
        
        
        System.out.print("Enter number of day to stay: ");
        numberDays = input.nextInt();
        
        price = price * numberDays;
        
        
        System.out.print("Do you want refrigerator or not?: (yes or no) ");
        
        choose = input.next();
        
        if (choose.equals("yes") == true)
            price = price + refrigerator * numberDays;
        else 
        price = price;
        
        
        System.out.print("Do you want extra bed? (yes or no) ");
        choose = input.next();

        
         if (choose.equals("yes") == true){
             
             if (roomType == "G" || roomType== "P")
             price = price+ 60 * numberDays;
             
             else 
                 price = price+ 80 * numberDays;}
         else 
         price = price;
         
        System.out.println("************************************");
        System.out.println ("Your booked a " + alphabet);  
        System.out.println("You stay for " + numberDays);
        System.out.println("Your room rate is RM" + roomRate);
        System.out.println("Total charge for your stay is " + price);
        

        
        
        
}
}
    

