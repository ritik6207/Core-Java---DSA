public class JaggedArray {
    public static void main(String[] args) {
        int arr[][] = {
                {3, 4, 6, 5, 3, 7, },
                {5, 6, 3},
                {8, 9, 2, 7, 1,}
                    };
        for(int i = 0; i <= 2; i++)
        {
            for (int j = 0; j <arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
