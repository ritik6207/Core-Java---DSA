public class MajorityElement {
    public static int majorityElement(int[] arr)
    {
        int majE = arr[0], majCnt = 1;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == majE)
            {
                majCnt++;
            }
            else
            {
                majCnt--;
                if(majCnt == 0)
                {
                    majE = arr[i];
                    majCnt = 1;
                }
            }
        }
        return majE;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 2};
        System.out.println(majorityElement(arr));

        int[] arr1 = {2,2, 4, 4, 4, 4};
        System.out.println(majorityElement(arr1));
    }
}
