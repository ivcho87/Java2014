/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;
import java.util.Scanner;
/**
 *
 * @author Ivcho
 */
public class Zad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of integers in the array: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Now enter the integers in the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        System.out.println("The sum of all positive numbers in the array is " + sum);
    }
    
}
