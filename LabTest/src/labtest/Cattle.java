/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtest;

/**
 *
 * @author Asus
 */
public class Cattle {
    
    private String id;
    private String weight;
    private String breedType;
    private String dateRegistered;
    Object getDateRegistered;
    
    Cattle(String id, String weight, String breedType, String dateRegistered){
        this.id = id;
        this.weight = weight;
        this.breedType = breedType;
        this.dateRegistered = dateRegistered;
        
}
    String getId() {
        return id;
    }
    
    String getWeight() {
        return weight;
    }
    
    String getBreedType() {
        return breedType;
    }
    
    String getDateRegistered() {
        return dateRegistered; 
    }
    
    void setWeight(String weight) {
        this.weight = weight;
    }
    
    void setBreedType(String breedType) {
        this.breedType = breedType;
    }
    
    void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }
}
