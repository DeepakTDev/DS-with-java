import java.util.*;

public class Merge1 {

    int[] sort(int[] arr)
    {
        if(arr.length == 1) {
            return arr;
        }
        int center = (int)Math.floor(arr.length/2);
        mergeSort(sort(Arrays.copyOfRange(arr, 0, center)), sort(Arrays.copyOfRange(arr, center+1, arr.length-1)));
    }

    void mergeSort(int left[], int right[])
    {
        int leftLength = m-l+1;
        int rightlength = r-m;

        int[] result = new int[left];
        int[] right = new int[rightlength];

        for (int i =0; i < leftLength; i++ ){
            left[i] = arr[l+i];
        }

        for (int j =0; j < rightlength; j++ ){
            right[j] = arr[m+1+j];
        }

        int i =0, j=0;
        int k = l;

        while(i < leftLength && j < rightlength) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }


        while(i < leftLength) {
            arr[k] = left[i];
            k++;
            i++;
        }

        while(j < rightlength) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }
    public static void main(String args[])
    {
        int[] arr = { 12, 11, 13, 5, 6, 7, 1, 2};
        Merge1 mObj = new Merge1();
        System.out.println("un Sorted Array");
        PrintArray(arr);

        System.out.println(" Sorted Array");
        PrintArray( mObj.sort(arr));
    }

    public static void PrintArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }
}