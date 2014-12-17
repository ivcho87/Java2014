/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad12;
/**
 *
 * @author Ivcho
 */
public class Zad12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myArray = new int [100];
        a1(myArray);
    }
    public static void a1(int[] m) {
        
        for (int i = 0; i<m.length; i++) 
        {
            System.out.println(i);
            if(i == 30){
                break;
            }
    
        }
    }
        
}
            
