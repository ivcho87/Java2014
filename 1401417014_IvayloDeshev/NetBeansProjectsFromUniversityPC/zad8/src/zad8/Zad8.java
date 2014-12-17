/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zad8;


import java.util.Scanner;
        
/**
 *
 * @author fmi
 */
public class Zad8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int var1 = input.nextInt();
        
        if(var1 > 0 && var1 < 100)
        {
            System.out.println("Your number is between 0 and 100.");
        }
        else if (var1 < 0 || var1 > 256)
        {
            System.out.println("Your number is incorrect!");
        }
        
        if( var1 != 4 )
        {
            System.out.println("Your number is not equal to 4");
        }
        else 
        {
            System.out.println("Your number is 4. Congrats!");
        }
        
        
    }
    
}
