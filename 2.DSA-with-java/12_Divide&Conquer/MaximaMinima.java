import java.util.*;
public class MaximaMinima {
    static class Pair
    {
        int min;
        int max;
    }
    public static Pair getMinMax(int[] arr, int i, int j)
    {
        Pair minmax = new Pair();
        Pair minmaxLeft = new Pair();
        Pair minmaxRight = new  Pair();

        //Small problem
        //if number of element is equal to 1
        if (i == j)
        {
            minmax.min  = arr[i];
            minmax.max = arr[i];
            return minmax;
        }

        //if number of element is equal to 2
        else if (i == j - 1) {
            if (arr[i] < arr[j])
            {
                minmax.min = arr[i];
                minmax.max = arr[j];
            }
            else
            {
                minmax.min = arr[j];
                minmax.max = arr[i];
            }
            return minmax;
        }

        //Big Problem - Divide and conquer Approach
        else
        {
            //1. Divide - C
            int mid = i + (j - i) / 2;
            //2. conquer
            //left side subtree - T(n/2)
            //minmaxLeft = min(left), max(left)
            minmaxLeft = getMinMax(arr, i, mid);
            //right side = subtree - T(n/2)
            //minmaxRight = min(right), max(right)
            minmaxRight = getMinMax(arr, mid + 1, j);
            //3. combine - C
            //Compared the minimum value of left and right side
            if(minmaxLeft.min < minmaxRight.min)
            {
                minmax.min = minmaxLeft.min;
            }
            else
            {
                minmax.min = minmaxRight.min;
            }
            //compared the maximum values of left and right side
            if(minmaxLeft.max < minmaxRight.max)
            {
                minmax.max = minmaxRight.max;
            }
            else
            {
                minmax.max = minmaxLeft.max;
            }
            return minmax;
        }
    }
    public static void main(String[] args) {
        int[] arr = {50, 45, 11, 9, 15, 75, 89, 97};
        int n = arr.length;

        Pair minmax = getMinMax(arr, 0, n - 1);
        System.out.println("The smallest element in an array is: " + minmax.min);
        System.out.println("The largest element in an array is: " + minmax.max);
    }
}
