//if all alphabets present in one string , it is called Pangram.
public class Pangram {
    public static void main(String[] args) {
        boolean flag = false;
        String s1 = "The quick Brown Fox jumps over LAZY doG";
        //replace white space;
        s1 = s1.replace(" ", "");
        //Change uppercase or lowercase
        s1 = s1.toUpperCase();
        char []ch = s1.toCharArray();

        int []ar = new int[26];
        for (int i = 0; i < ch.length; i++)
        {
            ar[ch[i] - 65]++;   // in uppercase -65 or lowercase -97
        }
        for (int i = 0; i < ar.length; i++)
        {
            if(ar[i] == 0)
            {
                System.out.println("It is not Pangram");
                flag = true;;
            }
        }
       if(flag == false)
       {
           System.out.println("It is Pangram");
       }
    }
}
