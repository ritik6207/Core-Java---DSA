public class Merge {
    public static void mergeProcedure(int[] arr, int leftIdx, int mid, int rightIdx)
    {
        int i, j, k;
        int n1 = mid - leftIdx + 1;
        int n2 = rightIdx - mid;
        int[] leftSubArray = new int[n1];
        int[] rightSubArray = new int[n2];
        for (i = 0; i < n1; i++)
        {
            leftSubArray[i] = arr[leftIdx + i];
        }
        for (j = 0; j < n2; j++)
        {
            rightSubArray[j] = arr[mid + 1 + j];
        }
        i = 0;
        j = 0;
        k = leftIdx;
        while (i < n1 && j < n2)
        {
            if(leftSubArray[i] <= rightSubArray[j])
            {
                arr[k] = leftSubArray[i];
                i = i + 1;
            }
            else {
                arr[k] = rightSubArray[j];
                j = j + 1;
            }
            k = k + 1;
        }
        while (i < n1)
        {
            arr[k] = leftSubArray[i];
            i = i + 1;
            k = k + 1;
        }
        while (j < n2)
        {
            arr[k] = rightSubArray[j];
            j = j + 1;
            k = k + 1;
        }
    }
    public static void mergeSort(int[] arr, int l, int r)
    {
        if (l < r)
        {
            int mid = l + (r - l)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            mergeProcedure(arr, l, mid, r);
        }
    }
    public static void printArray(int[] arr, int n)
    {
        for(int i = 0; i  < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {50, 20, 40, 90, 88, 11, 13, 19, 27};
        int n = arr.length;

        System.out.println("Before apply MergeSort Algo");
        printArray(arr, n);

        mergeSort(arr, 0, n - 1);

        System.out.println("After apply MergeSort Algo");
        printArray(arr, n);

    }
}
