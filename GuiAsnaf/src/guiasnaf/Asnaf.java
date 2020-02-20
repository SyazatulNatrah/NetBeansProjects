/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiasnaf;

/**
 *
 * @author Asus
 */
public class Asnaf {

    private String name, address, income, date, family, received;
    final private String IC;

    Asnaf(String name, String IC, String address, String income, String date, String family, String received) {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.income = income;
        this.date = date;
        this.family = family;
        this.received = received;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setIncome(String income) {
        this.income = income;
    }

    void setDate(String date) {
        this.date = date;
    }

    void setFamily(String family) {
        this.family = family;
    }

    void setReceived(String received) {
        this.received = received;
    }

    String getName() {
        return name;
    }

    String getIC() {
        return IC;
    }

    String getAddress() {
        return address;
    }

    String getIncome() {
        return income;
    }

    String getDate() {
        return date;
    }

    String getFamily() {
        return family;
    }

    String getReceived() {
        return received;
    }

}

