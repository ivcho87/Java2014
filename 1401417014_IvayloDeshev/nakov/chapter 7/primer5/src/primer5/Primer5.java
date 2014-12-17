/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer5;
import java.util.Arrays;
/**
 *
 * @author Ivcho
 */
public class Primer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int index =0; index < array.length; index++) {
        array[index] = 2 * array[index];
        }
    System.out.println(Arrays.toString(array));
    int n = array.length;
    int[] reversed = new int[n];
    for (int i = 0; i < n; i++) {
        reversed[n - i - 1] = array[i]; 
        }
        System.out.println(Arrays.toString(reversed));
    }
    
}
