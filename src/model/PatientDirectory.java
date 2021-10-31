/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author krishnamayavat
 */
public class PatientDirectory extends PersonDirectory{
    
    
    ArrayList<Patient> patientDirectory;
    
    public PatientDirectory() {
        this.patientDirectory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

   
   
    public Patient newPatient() {
        Patient patient = new Patient();
        patientDirectory.add(patient);
       return patient;
    }
    
    @Override
    public String toString(){
        String returnString = new String();
        int i = 0;
        for (Patient patient: patientDirectory){
            returnString += "Patient "+i+":\n";
            returnString += patient;
        }
        
        return returnString;
    }
    
}
