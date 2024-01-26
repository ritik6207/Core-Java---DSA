import java.util.Scanner;

public class LastDigitofEachElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        //find last digit of each elements
        int ans = 0;
        for(int i = 0; i < n; i++)
        {
            while(arr[i] > 0)
            {
                int rem = arr[i] % 10;
                ans = (ans * 10) + rem;
                arr[i] = arr[i] / 10;
            }
        }
        System.out.println(ans);
    }
}
