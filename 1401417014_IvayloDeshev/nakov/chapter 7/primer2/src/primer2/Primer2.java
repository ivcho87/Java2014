/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer2;
import java.util.*;
/**
 *
 * @author Ivcho
 */
public class Primer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of your array: ");
        int n = input.nextInt();
        
        int[] array = new int[n];
        for (int i = 0; i <n; i++) {
            System.out.println("Enter a value: ");
            array[i] = input.nextInt();
            
        }
        System.out.println(Arrays.toString(array));
    }
    
}
