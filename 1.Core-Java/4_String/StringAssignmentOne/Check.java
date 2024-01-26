package StringAssignmentOne;

public class Check {
    boolean  FindE()
    {
        String s1 = "umbrella";
        for (int i = 0; i < s1.length() - 1; i++)
        {
            if(s1.charAt(i) == 'e')
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
       Check obj = new Check();
       boolean s = obj.FindE();
        System.out.println(s);
    }
}
