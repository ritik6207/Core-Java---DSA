//jb kisi same String ko use krke koi other word banate hai bina koi extra character add kiye usse Anagram kahte hai
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "School Master";
        String s2 = "The classroom";    //"the classroom java" when compare this it is not an Anagram
        //replace white space if present , otherwise not
        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");
        //Convert uppercase or lowercase if letter is different cases, otherwise not
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        //Changing in character arrays because find ASCII value of each character
        char []arr1 = s1.toCharArray();
        char []arr2 = s2.toCharArray();
        //sorting the array
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //Compare the array
        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("It is an Anagram");
        }
        else {
            System.out.println("It is not an Anagram");
        }

    }
}
