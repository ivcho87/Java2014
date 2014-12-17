/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zad9;

import java.util.Scanner;

/**
 *
 * @author fmi
 */
public class Zad9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        double var1 = input.nextDouble();
        double var2 = input.nextDouble();
        
        double resultHolder = greaterThanFifty(var1, var2);
        
        if(resultHolder > 50)
        {
            System.out.println(resultHolder);
        }
        
    }
    
    public static double greaterThanFifty(double d1, double d2) 
    {
        double result = d1*d2;
            
        return result;
    }
    
}
