import java.util.*;
import java.io.*;
public class RandomizeQuickSort {
    public static int randomizeQuickSort(int[] arr, int l , int h)
    {
        int randomIndex = l + (int) Math.random() % (h - l + 1);

        int tem = arr[randomIndex];
        arr[randomIndex] = arr[l];
        arr[l] = arr[randomIndex];

        int i = l;
        int pivot = arr[l];
        for(int j = l + 1; j <= h; j++)
        {
            if(arr[j] <= pivot)
            {
                //swap(arr[i], arr[j])
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //swap(arr[l], arr[i])
        int tep = arr[l];
        arr[l] = arr[i];
        arr[i] = tep;

        return i;
    }

    public static void quickSort(int[] arr, int l, int h)
    {
        if (l < h)
        {
            //1. Divide the array into Sub-array
            int m = randomizeQuickSort(arr, l, h);

            //Conquer the sub-array into single Sorted Array
            quickSort(arr, l, m - 1);
            quickSort(arr, m + 1, h);
        }
    }
    public static void printArray(int[] arr, int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2, 45, 8,34, 50, 20, 70, 43, 80};
        int n = arr.length;
        System.out.println("Before Apply Quick Sort");
        printArray(arr, n);

        quickSort(arr, 0, n - 1);

        System.out.println("After apply Quick Sort");
        printArray(arr, n);
    }
}
