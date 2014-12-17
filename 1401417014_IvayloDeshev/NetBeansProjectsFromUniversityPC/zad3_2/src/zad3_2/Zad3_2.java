/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zad3_2;

import java.util.Scanner;

/**
 *
 * @author fmi
 */
public class Zad3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        arithmeticOperations();
    }
    
    
    public static void arithmeticOperations(){
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
