/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;
import java.util.Scanner;
/**
 *
 * @author Ivcho
 */
public class Zad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = input.nextInt();
        
        System.out.println("Enter b:");
        int b = input.nextInt();
        
        
       // param(a,b);
        System.out.println("The bigger number is: ");
        System.out.println(param(a, b));
        
    }
    
    public static int param(int a, int b) {
        int max;
        if (a>b) {
            max = a;
        }
        else 
            max = b;
        
        return max;
    
    
    
    
    } 
    
}
