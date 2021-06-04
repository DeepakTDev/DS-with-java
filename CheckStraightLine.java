import java.util.*;

public class CheckStraightLine {

    public static void main(String args[]){
        int[][] arr = {{1,2}, {2,3}, {3,4}};

        if (isInLine(arr)) {
            System.out.println("Is in line array");
        } else {
            System.out.println("Is not in line array");
        }
    }

    public static boolean isInLine(int[][] arr) {
        if (arr.length == 2) {
            return true;
        }

        int dy = arr[1][1] - arr[0][1];
        int dx = arr[1][0] - arr[0][0];

        for (int i =2; i < arr.length; i++) {
            int dx1 = arr[i][0] - arr[i][0];
            int dy1 = arr[i][1] - arr[i][1];

            if (dy * dx1  != dx* dy1) {
                return false;
            }
        }
        return true;
    }
}
