/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad10;
import java.util.Scanner;
/**
 *
 * @author Ivcho
 */
public class Zad10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String number = "";
        while(num > 0)
            {
                if (num % 2 == 0) {               
                    number = "0" + number;
                    num = num / 2;
                }
                else {
                    number = "1" + number;
                    num = num / 2;
                }
            }
        System.out.println(number);
    }
    
}
