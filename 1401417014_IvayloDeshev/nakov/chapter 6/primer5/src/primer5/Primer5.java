/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer5;
import java.util.Scanner;
/**
 *
 * @author Ivcho
 */
public class Primer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long factorial = 1;
        do {
            factorial *= n;
            n--;
        } 
        while (n>0);
        System.out.println("n! = " + factorial);
    }
    
}
