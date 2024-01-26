import java.util.Scanner;

public class KthLargestElement {
    public static int partition(int[] arr, int l, int h)
    {
        int i = l;
        int pivot = arr[l];
        for(int j = l + 1; j <= h; j++)
        {
            if(arr[j] <= pivot)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int tem = arr[l];
        arr[l] = arr[i];
        arr[i] = tem;
        return i;
    }
    public static int selectionProcedure(int[] arr, int l , int h, int k)
    {
        if (l < h)
        {
            //Divide the sub-problem
            int m = partition(arr, l, h);

            //check m is equal to k or not, because m is return by index of pivot.
            if(m == k - 1)  //k - 1, because we are return index not element position
            {
                return arr[m];
            }
            else if(m < k - 1)
            {
                // Go to right part and check Kth largest
                return selectionProcedure(arr, m + 1, h, k);
            }
            else
            {
                // Go to left part and check Kth largest
                return selectionProcedure(arr, l, m - 1, k);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Kth Largest number");
        int k = sc.nextInt();
        int kth = selectionProcedure(arr, 0, arr.length - 1, n - k + 1);
        if (k == -1) {
            System.out.println("Plzz! Enter Valid Position, Thank You!");
        } else if (k == 1) {
            System.out.println(k + "st largest element is: " + kth);
        } else if (k == 2) {
            System.out.println(k + "nd largest element is: " + kth);
        } else if (k == 3) {
            System.out.println(k + "rd largest element is: " + kth);
        } else {
            System.out.println(k + "th largest element is: " + kth);
        }
    }
}
