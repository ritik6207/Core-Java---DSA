import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int min_ind = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[min_ind])
                {
                    min_ind = j;
                }
            }
            if(min_ind != i)
            {
                int temp = arr[min_ind];
                arr[min_ind] = arr[i];
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 12, 11, 15, 23, 76, 34, 20, 24};
        selectionSort(arr);
        System.out.println("Sorted Array is : ");
        System.out.println(Arrays.toString(arr));
    }
}
