import java.util.Arrays;

public class CountOfInversions {
    //Brute force approach
    //Time Complexity: O(n^2)
    public static int inversionCount(int[] arr, int n)
    {
        int count = 0;
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(arr[i] > arr[j])
                {
                    count++;
                }
            }
        }
        return count;
    }

    //Optimize Approach using the Divide and Conquer
    //Time Complexity: O(nLog n)
    //Space Complexity: O(n)
    public static int mergeProcedure(int[] arr, int l, int mid, int h)
    {
        int swap = 0;
        int[] lsubarray = Arrays.copyOfRange(arr, l, mid + 1);
        int[] rsubarray = Arrays.copyOfRange(arr, mid + 1, h + 1);

        int i = 0, j = 0, k = l;
        while (i < lsubarray.length && j < rsubarray.length)
        {
            if(lsubarray[i] <= rsubarray[j])
            {
                arr[k++] = lsubarray[i++];
            }
            else
            {
                arr[k++] = rsubarray[j++];
                //calculate number of swap
                swap += (mid + 1) - (l + i);
            }
        }

        //copy the all elements in array of left array
        while (i < lsubarray.length)
        {
            arr[k++] = lsubarray[i++];
        }

        //copy the all elements in array of right array
        while (j < lsubarray.length)
        {
            arr[k++] = lsubarray[j++];
        }

        return swap;
    }
    public static int inversionCountDC(int[] arr, int l, int h)
    {
        int cnt = 0;
        if(l < h)
        {
            //1. Divide the big problem into sub-problem
            int mid = l + (h - l) / 2;
            //conquer the sub-problem
            //left side
            cnt += inversionCountDC(arr, l, mid);
            //right side
            cnt += inversionCountDC(arr, mid + 1, h);
            //combine the sub-problem into a single solution
            cnt += mergeProcedure(arr, l, mid, h);
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 8, 3, 4};
        int n = arr.length;

//        int count = inversionCount(arr, n);
        int countOpt = inversionCountDC(arr, 0, n - 1);
//        System.out.println("The inversion count of an array via brute force Approach  is: " + count);
        System.out.println("The inversion count of an array via Divide & Conquer Approach  is: " + countOpt);
    }
}
