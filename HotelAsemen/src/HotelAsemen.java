import java.util.*;

public class HotelAsemen {

    public static void main(String[] args) {
    
        double gardenView = 205.00;
        double poolView = 245.00;
        double lakeView = 300.00;
        double refrigerator = 25.00;
        double extraBedgarden = 60.00;
        double extraBedpool = 60.00;
        double extraBedlake = 80.00;
        String roomType;
        int numberDays = 0;
        int roomRate=0;
        String P;
        String L;
        String G = null;
        String alphabet;
        double price=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter room type (G-garden view; P-pool view; L-lake view;)");
        roomType = input.next();
     
        if (roomType.equals("G") == true); {
        alphabet = "Garden View room";
        }
        
        if (roomType.equals ("P") == true); {
        alphabet = "Pool View room";
        }
        
        if (roomType.equals("L") == true); {
        alphabet = "Lake View room";
         }
        
        System.out.println ("Your booked a " + alphabet);   
    }
    
}
