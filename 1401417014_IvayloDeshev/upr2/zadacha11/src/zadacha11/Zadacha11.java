/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadacha11;

import static zadacha11.Zadacha11.m2;

/**
 *
 * @author Ivcho
 */
public class Zadacha11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myArray = { 1, 2, 3, 4, 5};
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        m1(myArray);
        m2(array);
      //  System.out.println(m2[j]);
        
    }
    public static void m1(int[] m) 
    {
        for(int i = 0; i < m.length; i++) {
            System.out.println((m[i]));
            
        }      
    }
    public static void m2(int[] n) {
      //      
 
        for(int i = n.length - 1; i >= 0; i--){
            System.out.println((n[i]));
        }
        
           
      }
}
