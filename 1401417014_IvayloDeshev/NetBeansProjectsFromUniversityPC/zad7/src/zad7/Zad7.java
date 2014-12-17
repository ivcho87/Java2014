/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad7;
import java.util.*;

/**
 *
 * @author fmi
 */
public class Zad7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    System.out.println("Enter a number to compare to 0:");
    Scanner input = new Scanner(System.in);
    
    int i = input.nextInt();
    
    if(i==0) {
        System.out.println("Your number equals 0.");
        }
    if(i>0) {
        System.out.println("Your number is bigger than 0.");
        } 
    if(i<0) {
        System.out.println("Your number is smaller than 0.");
        }
    if(i>=0) {
        System.out.println("Your number is bigger or equal to 0.");
        }
    if(i<=0) {
        System.out.println("Your number is smaller or equal to 0.");
        }
    
    }
    
}
