/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author krishnamayavat
 */
public class Encounter {
      
    VitalSigns vs;
    String encDate;
    int enc;
    private static int count = 0;


    public Encounter(double heartrate,double bp,double wt,double height,double temp) {
        this.vs = new VitalSigns();
        vs.setHeartRate(heartrate);
        
        this.encDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY-MM-DD hh:mm:ss"));
        count++;
        enc = count;
    }
      
    
//    @Override
//    public String toString() {
//        return encDate; 
//    }

    
       
    
    
    public VitalSigns getVs() {
        return vs;
    }

    public void setVs(VitalSigns vs) {
        this.vs = vs;
    }

    public String getEncounterDatetime() {
        return encDate;
    }

    public void setEncounterDatetime(String encounterDatetime) {
        this.encDate = encounterDatetime;
    }

    public int getEnc() {
        return enc;
    }

    public void setEnc(int enc) {
        this.enc = enc;
    }
    
    
     
    
}
