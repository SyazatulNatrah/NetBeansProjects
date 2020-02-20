/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafe;

import java.util.*;

class Cafe {

    Scanner scan = new Scanner(System.in);
    private String licenceno;
    private String typefood, staff;

    Cafe(String licenceno, String typefood, String staff) {
        this.licenceno = licenceno;
        this.typefood = typefood;
        this.staff = staff;

        System.out.print("Enter Licence NO: ");
        licenceno = scan.nextLine();
        System.out.print("Enter Type of Food: ");
        typefood = scan.nextLine();
        System.out.print("Enter Staff: ");
        staff = scan.nextLine();
    }

    String getLicenceNo() {
        return licenceno;
    }

    String getTypeFood() {
        return typefood;
    }

    String getStaff() {
        return staff;
    }

    void setTypeFood(String typefood) {
        this.typefood = typefood;
    }

    void setStaff(String staff) {
        this.staff = staff;

        System.out.println("Licence Number: " + licenceno);
        System.out.println("Type of Food: " + typefood);
        System.out.println("Staff: " + staff);
    }
}
