/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Ivcho
 */
public class Zad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of integers in array1: ");
        int n1 = input.nextInt();
        System.out.println("Enter the number of integers in array2: ");
        int n2 = input.nextInt();
        int[] array1 = new int[n1];
        int[] array2 = new int[n2];
        System.out.println("Now enter the integers in array1: ");
        for (int i1 = 0; i1 < array1.length; i1++) {
            array1[i1] = input.nextInt();
        }
        System.out.println("Now enter the integers in array2: ");
        for (int i2 = 0; i2 < array2.length; i2++) {
            array2[i2] = input.nextInt();
        }
        System.out.println("Your arrays are: ");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        //for (int i = 0; i < array1.length; i ++) {
            
        //}
        if (array1.length != array2.length) {
            System.out.println("Your arrays are not the same size, they cannot be compared!");
            }
        
        
         boolean b = true;
        if (array1 != null && array2 != null){
          if (array1.length != array2.length)
              b = false;
          else
              for (int i = 0; i < array2.length; i++) {
                  if (array2[i] != array1[i]) {
                      b = false;    
                  }                 
            }
        }else{
          b = false;
        }
        System.out.println(b);
          
//        boolean b;
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array2.length; j++){
//                if (array1[i] == array2[j]) {
//                    b = true;
//                }
//                else b = false;
//                //System.out.println("Your arrays are the same!");
//                if (b = true) System.out.println("Your array are the same!");
//                else System.out.println("Your arrays are not the same!");
//            }
//        }
        //if (b = false) {
        //    System.out.println("Your arrays are not the same!");
        
        
    }
    
}
