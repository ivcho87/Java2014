/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zad6;

import java.util.Scanner;

/**
 *
 * @author fmi
 */
public class Zad6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Enter zero:");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        
        if(i==0) {
        System.out.println("You have entered zero!");
        }
        else System.out.println("You have not entered zero!");
        
    }
    
}
