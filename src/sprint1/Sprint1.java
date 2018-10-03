/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint1;

/**
 *
 * @author Hussein
 */
public class Sprint1 {

    /**
     * @param args he command line arguments
     */
    public static void main(String[] args) {
    
        Bilägare b1 = new Bilägare("Hussein", "Murar stigen 25", 32);
        Bilägare b2 = new Bilägare("Nazem", "mosshagen 60", 64);
        Bilägare b3 = new Bilägare("Ali", "Allingsåsvägen 1", 34);
        
        Bil c1 = new Bil("NUT 719", "Volvo");
        Bil c2 = new Bil("KEX 146", "Toyota");
        Bil c3 = new Bil("MMM 542", "Renault");
            
        c1.ägsAv(b3);
        c2.ägsAv(b2);
        c1.såld();
        c1.ägsAv(b1);
        
        printBil(c1);
        
      
        
        
        
    }
     private static void printBil(Bil bil){
        if (bil.getBilägare() == null){
            System.out.println("Bilen med regNummer" + bil.getRegnr() + " har ingen ägare");
        }
        else {
            System.out.println("Bilen med regNummer " + bil.getRegnr() + " är av typen " 
                    + bil.getSort() + " och ägs av "+ bil.getBilägare().getName());
        }
    }
}
