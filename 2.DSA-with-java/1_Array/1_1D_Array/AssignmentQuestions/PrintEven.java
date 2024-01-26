package AssignmentQuestions;
// Q2: Write a program to traverse over the elements of the array using for each loop and print all even
public class PrintEven {
    public static void main(String[] args) {
        int arr[] = {34,21,54,65,43};
        for(int x : arr)
        {
            if(x % 2 == 0)
            {
                System.out.print(x + " ");
            }
        }
    }
}
