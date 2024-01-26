import java.util.Arrays;

public class DistributesCandies {
    public static int candyCount(int[] arr)
    {
        int n = arr.length;
        int[] dp = new int[n];
        int totalCandies = 0;
        //Distribute at least one candy of each child
        Arrays.fill(dp, 1); // store in dp array 1 in all indexes of length

//        Left to Right
        for(int i = 1; i < n; i++)
        {
            if(arr[i] > arr[i - 1])
            {
                dp[i] = arr[i - 1] + 1;
            }
        }

//        Right to Left (n - 2)
        for(int i = n - 2; i >= 0; i--)
        {
            if(arr[i] > arr[i + 1] && dp[i] <= dp[i + 1] + 1)
            {
                dp[i] = dp[i + 1] + 1;
            }
        }

//        Find minimum of total Candies to distribute of their ranking of child
        for(int i = 0; i < n; i++)
        {
            System.out.print(dp[i] + " ");
            totalCandies += dp[i];
        }
        System.out.println();
        return totalCandies;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 1};
        System.out.println("Distribute minimum candies to each child of their ranking: " + candyCount(arr));
    }
}
