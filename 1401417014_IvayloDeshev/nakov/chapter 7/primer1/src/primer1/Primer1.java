/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer1;
import java.util.Arrays;
/**
 *
 * @author Ivcho
 */
public class Primer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //    int[] array = new int[] { 1, 2, 3, 4, 5 };
        int[] array = new int[9];
        array[0] = 5;
        array[1] = 54;
        array[2] = 6;
        array[3] = 34;
        array[4] = 76;
        array[5] = 8;
        array[6] = 56;
        array[7] = 8;
        array[8] = 2;
        // get array size
        int length = array.length;
        
        // declare and create the reversed array
        int [] reversed = new int[length];
        
        // initialize the reversed array
        for (int index = 0; index <length; index++) {
        
            reversed[length - index - 1] = array[index];
        }
        //print the revered array
        System.out.println(Arrays.toString(reversed));
    }
    
}
