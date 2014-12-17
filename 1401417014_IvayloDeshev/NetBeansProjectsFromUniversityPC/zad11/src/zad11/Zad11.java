/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zad11;
import java.util.Scanner;
/**
 *
 * @author fmi
 */
public class Zad11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        double var1 = input.nextDouble();
        double var2 = input.nextDouble();
        double var3 = input.nextDouble();
        double var4 = input.nextDouble();
        
        System.out.println(mathOpperation(var1, var4));
        System.out.println(mathOpperation(var2, var3));
        
        
    }
 
     public static double mathOpperation(double a, double b)
    {
    
        double resultHolder = a*a + 2*(a-b*b)+7*b;
        
        return  resultHolder;
    }
    
    
}
