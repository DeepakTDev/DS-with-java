//package com.company;// Java program for the above approach
import java.util.*;

public class Matrix {

    // Function to print in spiral order
    public static String spiralOrder(int[][] matrix)
    {

        int R = matrix.length, C = matrix[0].length;
        int[][] out = new int[R][C];

        int startC = 0, endColumn = C-1, startRow = 0, endRow = R-1;
        int counter =1;
        while(startC <= endColumn && startRow <= endRow) {

            for (int i = startC; i <= endColumn; i++) {
                out[startRow][i] = counter;
                counter++;
            }
            startRow++;

            for (int i = startRow; i <= endRow; i++) {
                out[i][endColumn] = counter;
                counter++;
            }
            endColumn--;

            for (int i = endColumn; i>= startC; i--) {
                out[endRow][i] = counter;
                counter++;
            }
            endRow--;

            for (int i = endRow; i>= startRow; i--) {
                out[i][startC] = counter;
                counter++;
            }
            startC++;

        }

        for (int i =0; i < R; i++) {
            for(int j=0; j <C;j++) {
                System.out.print(out[i][j] + " ");
            }

            System.out.println();
        }

        return "te";
    }

    // Driver Code
    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println(spiralOrder(a));
    }
}
