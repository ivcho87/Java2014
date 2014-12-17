/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d;

/**
 *
 * @author Ivcho
 */
public class D {

    /**
     * @param args the command line arguments
     */
 
        // TODO code application logic here
    }
    public static void main(String[] args) {
            int[] array = new int[] { 1, 2, 3, 4, 5 };
 
            // Get array size
            int length = array.length;
 
            // Declare and create the reversed array
            int[] reversed = new int[length];
 
            // Initialize the reversed array
            for (int index = 0; index < length; index++) {
                  reversed[length - index - 1] = array[index];
            }
           
            // Print the reversed array
            System.out.println(Arrays.toString(reversed));
      
}
