/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer6;
import java.util.Scanner;
/**
 *
 * @author Ivcho
 */
public class Primer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int num = n;
        long product = 1;
        do {
            product *= num;
            num++;
        } while (num<=m);
        System.out.println("product[n*m] = " + product);
    }
    
}
