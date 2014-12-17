/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proekt1;

/**
 *Дефинирайте клас който отразява човек. За решаване на конкретен проблем 
 * от всички характерситики на човека ни интересуват име, фамилия и години. 
 * Класът трябва да съдържа функционалност,  която позволява на всеки 
 * конкретен обек от този клас да се представи с името, фамилията и възрастта си.
 * @author Ivcho
 */
public class Person {
    
    private String name;
    private String family;
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
    public int getAge(){
        return age;
    }
    public void setAge (int age){
        this.age = age;
    }
    
    
    public Person (String name, String family, int age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }
}
