package StringAssignmentOne;

public class RemoveConsonants {
    public static void main(String[] args) {
        String s1 = "Hello , have a good day";
        String store = "";
        for (int i = 0; i < s1.length() - 1; i++)
        {
            char ch = s1.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
            {
                store += ch;
            }
        }
        System.out.println(store);
    }
}
