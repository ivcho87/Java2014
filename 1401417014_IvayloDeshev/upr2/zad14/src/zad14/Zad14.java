/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad14;

/**
 *
 * @author Ivcho
 */
public class Zad14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] array = { 1, -5, -4, 20, 0, 5, -4, 7};
        int sum = 0;
        for (int i = 0; i<array.length; i++) {
            if (array[i]<=0) {
                sum +=array[i];
            }
            else { 
                System.out.println(array[i]);
            }
        }
        System.out.println("The sum of negative numbers is " + sum);
        }
        
    }
    

