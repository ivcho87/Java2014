/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer4;
import java.util.*;
/**
 *
 * @author Ivcho
 */
public class Primer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String[] array = {"One", "Two", "Three", "Four"};
    for (int index = 0; index<array.length; index++) {
        System.out.printf("Element[%d] = %s%n", index, array[index]);
        }
    
        System.out.println(java.util.Arrays.toString(array));
    }
    
}
