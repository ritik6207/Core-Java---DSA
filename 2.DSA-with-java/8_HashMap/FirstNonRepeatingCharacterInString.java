import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        //Creating HashTable
        HashMap<Character , Integer> map = new HashMap<>();

        //Construct HashTable
        //key -> unique character in String
        //value -> frequency of each character in string

        for(int i = 0; i < str.length(); i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
            else {
                map.put(str.charAt(i), 1);
            }
        }

        int result = -1;
        for(int i = 0; i < str.length(); i++)
        {
            if (map.get(str.charAt(i)) == 1)
            {
                System.out.println("First Non-Repeating character in String at index: " + i);
                result = 1;
                break;
            }
        }
        if(result == -1)
        {
            System.out.println("No, Non-Repeating Character in String");
        }
    }
}
