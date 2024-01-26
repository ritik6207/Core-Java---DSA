public class DuplicateElement {
    public static void isDuplicate(int[] arr, int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println("Duplicate element in array is: " + arr[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 5, 6, 6, 7};
        int N = arr.length;
        isDuplicate(arr, N);
    }
}
