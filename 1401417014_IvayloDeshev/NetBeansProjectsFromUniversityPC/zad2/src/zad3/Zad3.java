/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zad3;

import java.util.*;
import java.io.IOException;

/**
 *
 * @author fmi
 */
public class Zad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        float var1 = input.nextFloat();
        float var2 = input.nextFloat();
        
        
        // float var1 = System.in.read();
        // float var2 = System.in.read();
        
        float sum = var1 + var2;
        float substract = var1 - var2;
        float multiply = var1 * var2;
        float divide = var1 / var2;
        
        System.out.print("sum = " + sum + ";\nsubstraction = " + substract + ";\nmultiply = " + multiply + ";\ndivision " + divide);
        
    }
    
}
