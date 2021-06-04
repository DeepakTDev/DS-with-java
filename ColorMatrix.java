import java.util.*;

public class ColorMatrix {

    public static void main(String args[]) {
        int[][] arr = {{1,1,1}, {1,1,0}, {1,0,1}};
        printImage(arr);

        fillColor(arr, 1, 1, 2, arr[1][1]);

        printImage(arr);
    }

    public static void printImage(int[][] input) {
        for(int[] arr: input) {
            for(int i:arr) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void fillColor(int[][] input, int i, int j, int color, int parent)
    {
        if (i < 0 || j < 0|| i > input.length-1 || j > input.length -1 || input[i][j] != parent) {
            return;
        }
        input[i][j] = color;
        fillColor(input, i+1, j, color, parent);
        fillColor(input, i-1, j, color, parent);
        fillColor(input, i, j+1, color, parent);
        fillColor(input, i, j-1, color, parent);
    }
}
