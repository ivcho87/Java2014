/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygarrage;


public class Person {
    static int countPersons = 0;
    private String name;
    private String family;
    private String occupation;
    private int age;
    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getFamily(){
        return family;
    }
    public void setFamily (String family){
        this.family = family;
    }
    public String getOccupation(){
        return occupation;
    }
    public void setOccupation(String occupation){
        this.occupation = occupation;
    }
    public int getAge(){
        return age;
    }
    public void setAge (int age){
        this.age = age;
    }
    
    public Person (String name, String family, int age, String occupation) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.occupation = occupation;
        countPersons +=1;
    }
}
