/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.*;

/**
 *
 * @author krishnamayavat
 */
public class Person{
    
        String personName;
        int age;
         int healthid;
       String city;
        String community;
      String house;
        int zipcode;
        boolean patientb;
        ArrayList<Encounter> encHistories;
            
//    public Person(){
//        this.encHistory = new EncounterHistory(); 
//    }
//

    public ArrayList<Encounter> getEncHistories() {
        return encHistories;
    }

    public void setEncHistories(ArrayList<Encounter> encHistories) {
        this.encHistories = encHistories;
    }
 


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthid() {
        return healthid;
    }

    public void setHealthid(int healthid) {
        this.healthid = healthid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public boolean isPatientb() {
        return patientb;
    }

    public void setPatientb(boolean patientb) {
        this.patientb = patientb;
    }

    
       
       

       

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
       
//    @Override
//  public String toString(){
//  
//      return personName;
//  }
    
}
