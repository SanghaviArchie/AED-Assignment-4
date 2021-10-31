/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author krishnamayavat
 */
public class EncounterHistory{
    
    
      private ArrayList<Encounter> encHistory;
      
  
      public EncounterHistory() {
        encHistory = new ArrayList<Encounter>();
    } 

    public ArrayList<Encounter> getHistory() {
        
        return (ArrayList<Encounter>) encHistory;
    }

    public void setHistory(ArrayList<Encounter> encHistory) {
        this.encHistory = encHistory;
    }
    
    
     public void addEncounterHistory(double heartrate,double bp,double wt,double height,double temp) {
        Encounter newenc = new Encounter(heartrate,bp,wt,height,temp);
        this.encHistory.add(newenc);
//        return  newenc;
    }
   
     
    
}
