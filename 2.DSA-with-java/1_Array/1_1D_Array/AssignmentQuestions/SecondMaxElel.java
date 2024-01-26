package AssignmentQuestions;

public class SecondMaxElel {
    public static void main(String[] args) {
        int arr[] = {34,21,54,65,43};
        int arr_size = arr.length;
        if(arr_size < 2)
        {
            System.out.println("Invilad input");
        }

        int secondMax;
        int largest = secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr_size; i++)
        {
            largest = Math.max(largest, arr[i]);
        }
        for(int i = 0; i < arr_size; i++)
        {
            if(arr[i] != largest)
            {
                secondMax = Math.max(secondMax, arr[i]);
            }
        }
        if(secondMax == Integer.MIN_VALUE)
        {
            System.out.println("There is no second largest element present in array");
        }
        else
        {
            System.out.println("Second Largest " + secondMax);
        }
       
    }
}
