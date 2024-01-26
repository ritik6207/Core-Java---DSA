public class SubsetSumProblem {
    public static boolean isSubsetSum(int[] arr, int n, int sum)
    {
        boolean[][] subset = new boolean[sum + 1][n + 1];

        //if a sum is zero then return ture;
        for (int i = 0; i <= n; i++)
        {
            subset[0][i] = true;
        }

        //if sub is not 0 set is empty, then return false
        for (int i = 1; i <= sum; i++)
        {
            subset[i][0] = false;
        }

        for (int i = 1; i <= sum; i++)
        {
            for (int j = 1; j <=n; j++)
            {
                subset[i][j] = subset[i][j - 1];
                if (i >= arr[j - 1])
                {
                    subset[i][j] = subset[i][j] || subset[i - arr[j - 1]] [j - 1];
                }
            }
        }
        return subset[sum][n];
    }
    public static void main(String[] args) {
        int[] arr = {6, 2, 3, 1};
        int sum = 5;
        if (isSubsetSum(arr, arr.length, sum))
        {
            System.out.println("Subset is found");
        }
        else
        {
            System.out.println("Subset is not found");
        }
    }
}
