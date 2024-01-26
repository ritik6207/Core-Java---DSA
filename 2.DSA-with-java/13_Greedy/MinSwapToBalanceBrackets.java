public class MinSwapToBalanceBrackets {
    public static int swapCount(String s)
    {
        char [] chars = s.toCharArray();
        int countL = 0, countR = 0, imbalance = 0 ,swap = 0;
        for (char aChar : chars) {
            if (aChar == '[') {
                countL++;
                if (imbalance > 0) {
                    swap += imbalance;
                    imbalance--;
                }
            } else if (aChar == ']') {
                countR++;
                imbalance = (countR - countL);
            }
        }
        return swap;
    }
    public static void main(String[] args) {
        String s = "[]][][";
        System.out.println("Minimum swap to balance Brackets"+ swapCount(s));

        String s1 = "[[][]]";
        System.out.println(swapCount(s1));

        String s3 = "[]][[]";
        System.out.println(swapCount(s3));
    }
}
