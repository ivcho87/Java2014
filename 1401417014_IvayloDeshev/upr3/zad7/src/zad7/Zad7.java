/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad7;
import java.util.Scanner;
/**
 *
 * @author Ivcho
 */
public class Zad7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int max = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of integers in the array: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Now enter the integers in the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            max = array[1];
            if (array[i] > max) {
                max = array[i];
                }
            }
        System.out.println("The maximal element is " + max);
        }
    }
    
