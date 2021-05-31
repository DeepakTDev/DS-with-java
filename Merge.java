import java.util.*;

public class Merge {

    void sort(int[] arr, int lowerIndex, int upperIndex)
    {
        if(lowerIndex < upperIndex) {
            int m = lowerIndex + (upperIndex - lowerIndex)/2;
            sort(arr, lowerIndex, m);
            sort(arr, m+1, upperIndex);
            mergeSort(arr, lowerIndex, m, upperIndex);
        }
    }

    void mergeSort(int arr[], int l, int m, int r)
    {
        int leftLength = m-l+1;
        int rightlength = r-m;

        int[] left = new int[leftLength];
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
        Merge mObj = new Merge();
        System.out.println("un Sorted Array");
        PrintArray(arr);
        mObj.sort(arr, 0, arr.length-1);
        System.out.println(" Sorted Array");
        PrintArray(arr);
    }

    public static void PrintArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }
}