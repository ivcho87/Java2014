/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upr2;
import java.util.Scanner;
/**
 *
 * @author Ivcho
 */
public class Upr2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i<=n; i++) {
            if (i%3 == 0 || i%7 == 0){
                System.out.print(" ");
            } 
            else System.out.print(i + " ");
        }    
    }
    
}
