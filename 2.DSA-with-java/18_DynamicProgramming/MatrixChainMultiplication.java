public class MatrixChainMultiplication {
    public static int matrixChainOrder(int[] p, int n)
    {
        /* For simplicity of the program, one extra row and	one extra column are allocated in m[][]. 0th row and 0th column of m[][] are not used */
        int[][] m = new int[n][n];

        int i, j, k, l, q;
        /*
        m[i, j] = Minimum number of scalar multiplications needed to compute the matrix	A[i]A[i+1]...A[j] = A[i..j] where
		dimension of A[i] is p[i-1] x p[i]
         */

        //cost is zero when multiplying one matrix.
        for(i = 1; i < n; i++)
        {
            m[i][i] = 0;
        }

        //l is chain length
        for(l = 2; l < n; l++)
        {
            for(i = 1; i < n - l + 1; i++)
            {
                j = i + l -1;
                if(j == n)
                    continue;
                m[i][j] = Integer.MAX_VALUE;
                for(k = i; k <= j - 1; k++)
                {
                    q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
                    if (q < m[i][j])
                    {
                        m[i][j] = q;
                    }
                }
            }
        }
        return m[1][n - 1];
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4};
        int size = arr.length;
        System.out.println("Minimum number of multiplication is : " + matrixChainOrder(arr, size));
    }
}
