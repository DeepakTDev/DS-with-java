import java.util.*;

public class TrustJudge {

    public static void main(String args[]) {
        int[][] arr = {{1, 3}, {1, 4}, { 2, 3}, {4, 3}, {1, 2}};
        int n =4;

        if (arr.length < n-1) {
            System.out.println("not valid");
            return;
        }

        int[] trusty = new int[n+1];
        int[] trustBy = new int[n+1];

        for (int[] pair:arr) {
            trusty[pair[0]]++;
            trustBy[pair[1]]++;
        }


        for(int i = 1; i < n+1; i++) {
            if (trusty[i] == 0 && trustBy[i] == n-1) {
                System.out.println(i + " is a judge");
                return;
            }
        }

        System.out.println("not found");
    }
}
