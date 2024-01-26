public class LongestCommonSubsequenceProblem {
    public static int lcs(String x, String y, int i, int j, int[][] result)
    {
        if (i == 0 || j == 0)
        {
            return 0;
        }

        if (result[i][j] != -1)
        {
            return result[i][j];
        }
        if (x.charAt(i - 1) == y.charAt(j - 1))
        {
            result[i][j] = 1 + lcs(x, y, i - 1, j - 1, result);
        }
        else
        {
            result[i][j] = Math.max(lcs(x, y, i - 1, j, result), lcs(x, y, i, j - 1, result));
        }
        return result[i][j];
    }
    public static void main(String[] args) {
        String x = "ABCBDAS";
        String y = "BDCABA";

        int m = x.length();
        int n = y.length();

        int[][] result = new int[m + 1][n + 1];

        for (int i = 0; i <=m; i++)
        {
            for (int j = 0; j <= m; j++)
            {
                result[i][j] = -1;
            }
        }
        System.out.println("Length of LCS is : " + lcs(x, y, m, n, result));
    }
}
