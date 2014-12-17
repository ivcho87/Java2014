/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer3;
import java.util.*;
/**
 *
 * @author Ivcho
 */
public class Primer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] array = new int[n];
    for (int i = 0; i<n; i++) {
    
        array[i] = input.nextInt();
        }
    boolean symetric = true;
    for (int i = 0; i< (array.length - 1)/2; i++) {
        if (array[i] != array[n-i-1])
        symetric = false;
        }
        System.out.printf("Symetric? %b%n", symetric);
    }
    
}
