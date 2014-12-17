/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proekt1;

/**
 *
 * @author Ivcho
 */
public class Proekt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person ivan = new Person("Иван", "Иванов", 25);
//        ivan.setName("Иван");
//        ivan.setFamily("Иванов");
//        ivan.setAge(25);
       
        Person georgi = new Person("Георги", "Георгиев", 28);
//        georgi.setName("Георги");
//        georgi.setFamily("Георгиев");
//        georgi.setAge(28);
        Person petq = new Person("Петя", "Петкова", 23);
        System.out.println("My name is " + ivan.getName() + " " + ivan.getFamily() +". I am a very stupid bot, and I am " + ivan.getAge() + " years old." );
        System.out.println("My name is " + georgi.getName() + " " + georgi.getFamily() +". I am a very stupid bot, and I am " + georgi.getAge() + " years old." );
        System.out.println("My name is " + petq.getName() + " " + petq.getFamily() +". I am a very stupid bot, and I am " + petq.getAge() + " years old." );
    }
    
}
