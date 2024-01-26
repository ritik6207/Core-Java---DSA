public class PrintAllPermutationString {
    public static String swap(String str, int i, int j)
    {
        char [] charArray = str.toCharArray();

        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
    }

    public static void permute(String str, int l, int r)
    {
        if(l == r)
        {
            System.out.println(str);
        }
        else{
            for(int i = l; i <= r; i++)
            {
                str = swap(str, l, i);
                permute(str, l + 1, r);

                //Backtracking
                str = swap(str, l, i);
            }
        }
    }
    public static void main(String[] args) {
        String str = "XY";
        int n = str.length();
        System.out.println("For the String: " + str + " Permutation are: ");
        permute(str, 0, n - 1);
        System.out.println();

        String str1 = "ABC";
        int n1 = str1.length();
        System.out.println("For the String: " + str1 + " Permutation are: ");
        permute(str1, 0, n1 - 1);
    }
}
