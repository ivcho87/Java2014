/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer7;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author Ivcho
 */
public class Primer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("n= ");
        int n = input.nextInt();
        System.out.println("m= ");
        int m = input.nextInt();
        long result =1;
        for(int i = 0; i<m; i++) {
            result *=n;
        }
        System.out.println("n^m= " + result);
        
        for (int small = 1, large = 10; small<large; small++, large--) 
        System.out.printf("%d %d\n", small, large);
        
    }
    
    
}
