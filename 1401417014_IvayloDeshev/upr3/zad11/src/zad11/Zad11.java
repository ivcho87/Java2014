/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad11;

/**
 *
 * @author Ivcho
 */
public class Zad11 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        
    //int n = 10;
    for(int i=1; i<=10; i++){
            System.out.print(fib(i) +" ");
    }
    
    
}
public static int fib(int num)
    {
        if(num == 1 || num == 2)
        {
            return 1;
        }
        int f1=1, f2=1, fibonacci=1;
        for(int i= 3; i<= num; i++){
            fibonacci = f1 + f2; 
            f1 = f2;
            f2 = fibonacci;
          
        }
        return fibonacci; 
      
    }   
  
}