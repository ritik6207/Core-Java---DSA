public class QuickSort {
    public static int partision(int[] arr, int l, int r)
    {
        int i = l;
        int pivot = arr[l];

        for(int j = l + 1; j <= r; j++)
        {
            if (arr[j] <= pivot)
            {
                i = i + 1;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void quickSort(int[] arr, int l, int r)
    {
        if (l < r)
        {
            int m = partision(arr, l, r);
            quickSort(arr, l , m - 1);
            quickSort(arr, m + 1, r);
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
        int[] arr = {50, 20, 40, 90, 88, 11, 13, 19, 27};
        int n = arr.length;

        System.out.println("Before Quick Sort");
        printArray(arr, n);

        quickSort(arr, 0, n - 1);

        System.out.println("After Quick Sort");
        printArray(arr, n);
    }
}
