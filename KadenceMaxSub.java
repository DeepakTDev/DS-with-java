import java.util.*;

public class KadenceMaxSub {
    public static void main(String args[]) {
        int ar[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        int maxSum = Integer.MIN_VALUE;

        for (int i =1; i < ar.length; i++) {
            if (ar[i-1] > 0) {
                ar[i] = ar[i] + ar[i-1];
            }
            if (maxSum < ar[i]) {
                maxSum = ar[i];
            }
        }

        System.out.println("Maximum sub array" + maxSum);
    }
}
