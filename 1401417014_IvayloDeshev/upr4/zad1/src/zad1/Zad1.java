/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

/**
 *
 * @author Ivcho
 */
public class Zad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] names = { "Георги", "Иван", "Петър", "Стамат", "Николай", "Ивета", "Пенка" };
        for (String name : names) {
            int read = name.indexOf("Ив");
            System.out.printf("%s",read);
//int read = names.indexOf("Ив");
        }
        
    }
    
}
