import java.util.*;

public class SingleNumberArray {

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 1,2 ,3,4};

        int result = 0;

        for (int i =0; i < arr.length; i++) {
            result = result ^ arr[i];
        }

        System.out.println("Single value in array" + result);
    }
}
