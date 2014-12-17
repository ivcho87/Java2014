/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer9;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ivcho
 */
public class Primer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = input.nextInt();
        int[][] matrix = new int[rows][cols];
        
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.printf("matrix[%d,%d]", row, col);
                matrix[row][col] = input.nextInt();
                }
            }
            System.out.println(Arrays.deepToString(matrix));
//        int[][] matrix = {
//            { 0, 2, 4, 0, 9, 5},
//            { 7, 1, 3, 3, 2, 1},
//            { 1, 3, 9, 8, 5, 6},
//            { 4, 6, 7, 9, 1, 0}
//        };
        // find the maximal sum platform of 2x2
        int bestSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[0].length - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if(sum > bestSum) {
                    bestSum = sum;
                    bestRow = row;
                    bestCol = col;
                }
            }
        }
        
        //print the result
        System.out.println("The best platform is: ");
        System.out.printf(" %d %d%n", matrix[bestRow][bestCol], matrix[bestRow][bestCol + 1]);
        System.out.printf(" %d %d%n", matrix[bestRow + 1][bestCol], matrix[bestRow + 1][bestCol + 1]);
        System.out.printf("The maximal sum is: %d%n", bestSum);
        
        
    }
    
}
