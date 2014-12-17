/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

/**
 *
 * @author Ivcho
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //String[] array = new String[]{'Пика', 'Купа', 'Каро', 'Спатия'};

        String[] myArray = new String[]{"Пика", "Купа", "Каро", "Спатия"};
        String[] myArray2 = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Вале", "Дама", "Поп", "Асо",};
        
        for (int j=0; j<myArray2.length; j++ ) {
            
            for (int i=0; i<myArray.length; i++ ) {
                System.out.print(myArray2[j] + " ");
                System.out.print(myArray[i]);
                System.out.print("\n");
        }
        }
    }
    
}
