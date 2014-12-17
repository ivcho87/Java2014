/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad13;

/**
 *
 * @author Ivcho
 */
public class Zad13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        
      // int[] myArray = new int [100];
       int[] myArray = {0,1,31};
       
       int index =  a1(myArray);
      
       System.out.println(index);
    }
    public static int a1(int[] array) {
        int index = 0;
        for (int i = 0; i<array.length; i++) 
        {
            if(array[i] > 30)
           
            index = i;
            
          
        }return index;  
    }
        
}