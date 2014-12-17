/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer8;

/**
 *
 * @author Ivcho
 */
public class Primer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = {5,34,54,21,546,34};
        for (int i : numbers) {
            System.out.printf("%d ", i);
        }
        System.out.printf("\n");
        String[] towns = {"София", "Пловдив", "Варна", "Бургас"};
        for(String town : towns) {
            System.out.printf("%s ", town);
        }
    }
    
}
