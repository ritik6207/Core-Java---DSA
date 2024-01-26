import java.util.*;
public class HashSet_And_LinkedHashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        System.out.println(hs);  //HashSet store only unique value of the collection not any duplicate and not any Data type of same collection

        LinkedHashSet hs1 = new LinkedHashSet();
        hs1.add(100);
        hs1.add(20);
        hs1.add(30);
        hs1.add(40);
        System.out.println(hs1);
    }
}
