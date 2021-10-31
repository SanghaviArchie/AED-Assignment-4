/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author krishnamayavat
 */
public class Patient extends Person {
    
     Encounter encounter;
    EncounterHistory encHistory;

    // Constructor for adding new person
    public Patient() {
       this.encHistory = new EncounterHistory(); 
    }
    
       // Constructor for getting Existing Person
    Patient(Person person) {
        this.personName = person.getPersonName();
        this.healthid = person.getHealthid();
        this.age = person.getAge();
        this.city = person.getCity();
        this.community = person.getCommunity();
        this.house = person.getHouse();
        this.zipcode = person.getZipcode();
        this.patientb=person.isPatientb();
        this.encHistory = new EncounterHistory();
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    public EncounterHistory getEncHistory() {
        return encHistory;
    }

    public void setEncHistory(EncounterHistory encHistory) {
        this.encHistory = encHistory;
    }
    
     @Override
  public String toString(){
  
      return personName;
  }
    
}
