/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author fmi
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        byte myByte = 2;
        short myShort = 57;
        int myInt = -123;
        long myLong = 123;
        
        float myFloat = 2.34F;
        double myDouble ;
        
        char myChar = 'c';
        boolean myBoolean = false;
        
        
        // -----------------Referent ----------
        String myName = "NeshtoSi";
        Object myOtherByte = 3;
        
//        System.out.print(myName);
        System.out.println(myName);
        System.out.println("Enter your first name: ");
        int ch;
        ch = System.in.read();
        System.out.print((char) ch);
        
//        while ((ch = System.in.read()) != '\n') 
//            {
//                System.out.println((char) ch);  
//            }
        
        
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        System.out.print(firstName);
        
    }
    
}
