import java.util.*;

public class QuickSort {

    int partition(int arr[], int l, int h)
    {
        int pi = arr[h];
        int i = l-1;

        for (int j = l; j < h; j++) {
            if (arr[j] < pi) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, h);
        return i+1;
    }

    void swap(int arr[], int source, int dest)
    {
        int temp = arr[source];

        arr[source]  = arr[dest];
        arr[dest] = temp;
    }
    void quickSort(int arr[], int l, int h)
    {
        if (l < h) {
            //get paviot index
            int p = partition(arr, l, h);

            quickSort(arr, l, p-1);
            quickSort(arr, p+1, h);
        }
    }
    public static void main(String args[])
    {
        int[] arr = { 12, 11, 13, 5, 6, 7, 1, 2};
        PrintArray(arr);
        QuickSort qs = new QuickSort();

        qs.quickSort(arr, 0, arr.length -1);
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
