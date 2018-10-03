/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint1;

/**
 *
 * @author Hussein instansee variablar
 * 
 */
public class Person {
    
    // INSTANS VARIABLAR
     private String namn;
    private String adress;
    private int ålder;
    
    public Person (String namn, String adress, 
            int ålder){
        this.namn = namn;
        this.adress = adress;
        this.ålder = ålder;
    }
       
    public String getName() {
        return namn;
    }

}
