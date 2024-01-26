
public class MissingElement {
    public int missingElement(int arr[])
    {
        int n = arr.length;
        int sum_natural_num = ((n + 1) * (n + 2)) / 2;
        int sum_Elem = 0;
        for(int i = 0; i < n; i++)
        {
            sum_Elem += arr[i];
        }
        int missing_num = 0;
        missing_num = sum_natural_num - sum_Elem;
        return missing_num;
    }
    public static void main(String[] args) {
        MissingElement m = new MissingElement();
        int[] arr = {1, 2, 3, 7, 6, 5};
        int missing_num = m.missingElement(arr);
        System.out.println("Missing element in array is: " + missing_num);
    }
}
