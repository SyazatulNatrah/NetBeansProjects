/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iams;

/**
 *
 * @author user
 */
public class Inventory {
    private String item;
    private String quantity;
    
    Inventory(String item,String quantity){
        this.item = item;
        this.quantity = quantity;
    }
    void setName(String item){
        this.item = item;
    }
    void setQuantity(String quantity){
        this.quantity = quantity;
    }
    String getItem(){
        return item;
    }
    String getQuantity(){
        return quantity;
    }

    void set(String item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
