package AssignmentQuestions;

public class MaxElel {
    public static void main(String[] args) {
        int arr[] = {34,21,54,65,43};
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            largest = Math.max(largest, arr[i]);
        }
        System.out.println("Largest Element is : " + largest);
    }
}
