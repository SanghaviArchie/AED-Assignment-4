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
public class PersonDirectory {
     private List<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList<Person>();
    }

    public List<Person> getPersonlist() {
        return personList;
    }

    public Person addPerson() {
        Person newPerson = new Person();
        personList.add(newPerson);
        return newPerson;
    }

    public void removePerson(Person p) {
        personList.remove(p);
    }

    
 
       
}
