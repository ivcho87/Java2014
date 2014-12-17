/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer2;
import java.util.Scanner;
/**
 *
 * @author Ivcho
 */
public class Primer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        int n = input.nextInt();
        int num = 0;
        int sum = 0;
        System.out.print("The sum is 1");
        while (num<n)   {
            num++;
            sum += num;
            System.out.printf("+%d", sum);
            
        }
        System.out.printf(" = %d%n", sum);
        
    }
    
}
