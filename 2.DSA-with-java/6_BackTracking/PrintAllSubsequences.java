import java.util.ArrayList;
import java.util.*;
public class PrintAllSubsequences {
    public static void printSubsequences(int[] arr, int index, ArrayList<Integer> tempArr)
    {
        //Base case Condition
        if(index == arr.length)
        {
                //print the subsequences --> but do not print empty entries
            if(tempArr.size() > 0)
            {
                System.out.println(tempArr);
            }
            return;
        }

        //Recursive call

        //Include

        printSubsequences(arr, index + 1, tempArr);
        //Add the value in tempArr
        tempArr.add(arr[index]);
        //Do not Include

        printSubsequences(arr, index + 1, tempArr);

        //Remove the last value
        tempArr.remove(tempArr.size() - 1);
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        System.out.println("For the Array - " + Arrays.toString(arr1));
        printSubsequences(arr1, 0, new ArrayList<>());
        System.out.println();
        int[] arr2 = {1, 2, 3};
        System.out.println("For the Array - " + Arrays.toString(arr2));
        printSubsequences(arr2, 0, new ArrayList<>());
    }
}
