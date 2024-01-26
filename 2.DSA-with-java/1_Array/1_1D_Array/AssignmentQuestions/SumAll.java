package AssignmentQuestions;
// Q1: Write a program to print the sum of all the elements present on even indices in the given array.
public class SumAll {
    public static void main(String[] args) {
        int arr[] = {3,20,4,6,9};
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
           if(i % 2 == 0)
           {
            sum += arr[i];
           }
        }
        System.out.println(sum);
    }
}
