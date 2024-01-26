import java.util.Scanner;



public class SqureRoot {
    public static int squreRoot(int num)
    {
        int low = 0;
        int high = num;
        int result = -1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            long val = mid * mid;
            //Prefect squre root 
            if(val == num)
            {
                return mid;
            }
            //Store floor value , in case number is not square root , pirnt floor value
            else if(val < num)
            {
                result = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, you want to perfect root and floor value");
        int n = sc.nextInt();
        int ans = squreRoot(n);
        System.out.println("Squae root of given number is " + ans);
    }
}
