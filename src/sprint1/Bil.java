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
public class Bil {
    protected String registreringnummer;
    protected String bilmärke;
    protected Bilägare ägare;
    
    public Bil(String registreringnummer, String bilmärke){
        this.registreringnummer = registreringnummer;
        this.bilmärke = bilmärke;
    }
    
    public void ägsAv(Bilägare nyeÄgaren){
        ägare = nyeÄgaren;
        
    }
    public void såld(){
        ägare = null;
    }
    public Bilägare getBilägare(){
        return ägare;
    }
    public String getRegnr(){
        return registreringnummer;
    }
    public String getSort(){
        return bilmärke;
    }
}
  
 
