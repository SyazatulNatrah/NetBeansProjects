/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencypackage;

import java.util.*;

public class AgencyPackage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String destination;
        String price = null;
        String duration = null;
        String description;
        String alphabet;

        alphabet = "";
        System.out.println("Enter destination (PEN-Kuala Lumpur to Penang; AOR-Kuala Lumpur to Alor Setar; HAT-Kuala Lumpur to Hatyai; JOH-Kuala Lumpur to Johor; MEL-Kuala Lumpur to Melaka): ");
        destination = scan.next();

        switch (destination) {
            case "PEN":
                alphabet = "Kuala Lumpur to Penang";
                duration = "3 hours 55 minute";
                price = "RM45.00/person";
                break;
            case "AOR":
                alphabet = "Kuala Lumpur to Alor Setar";
                duration = "6 hours 15 minute";
                price = "RM60.00/person";
                break;
            case "HAT":
                alphabet = "Kuala Lumpur to Hatyai";
                duration = "8 hours 10 minute";
                price = "RM85.00/person";
                break;
            case "JOH":
                alphabet = "Kuala Lumpur to Johor";
                duration = "4 hours 20 minute";
                price = "RM50.00/person";
            case "MEL":
                alphabet = "Kuala Lumpur to Melaka";
                duration = "2 hours 5 minute";
                price = "RM25.00/person";
            default:
                break;
        }
        System.out.println("**********************************************************");
        System.out.println("Your Destination is " + alphabet);
        System.out.println("Duration " + duration);
        System.out.println("Price " + price);
        
    }
}
