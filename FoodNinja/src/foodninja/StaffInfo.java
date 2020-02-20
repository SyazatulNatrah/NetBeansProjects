/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodninja;

public class StaffInfo {
    
    private String id;
    private String staff_name;
    private String salary;
    private String branch;
    
    StaffInfo(String id, String staff_name, String salary, String branch){
        this.id = id;
        this.staff_name = staff_name;
        this.salary = salary;
        this.branch = branch;
    }
    String getId() {
        return id;
    }
    
    String getStaff_Name() {
        return staff_name;
    }
    
    String getSalary() {
        return salary;
    }
    
    String getBranch() {
        return branch; 
    }
    
    void setStaff_Name(String staff_name) {
        this.staff_name = staff_name;
    }
    
    void setSalary(String salary) {
        this.salary = salary;
    }
    
    void setBranch(String branch) {
        this.branch = branch;
    }
    
}
