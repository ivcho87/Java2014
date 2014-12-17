/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zad10;
import java.util.Scanner;
/**
 *
 * @author fmi
 */
public class Zad10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        double var1 = input.nextDouble();
        double var2 = input.nextDouble();
        
        System.out.println(mathOpperation(var1, var2));
        
    }
    
    public static double mathOpperation(double d1, double d2)
    {
    
        double result = d1 + d2;
         
        double resultHolder;
        
        if(result > 20)
        {
            resultHolder = (d1+d2)*(d1-d2);
        }
        else 
        {
            resultHolder = (d1+d2)/5;
        }
        return resultHolder;
    }
    
}
