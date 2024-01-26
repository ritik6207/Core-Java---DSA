import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);

        System.out.println(ts);  //TreeSet follows Binary Search tree Data structure, if balanced tree follows in-order (LVR)
        //Duplicate is not allowed
//        ts.add(100);
//        System.out.println(ts);

        System.out.println(ts.higher(50));
        System.out.println(ts.lower(50));

        //if element are not present in collection then print 40 greater than value and 40 less than value
        System.out.println(ts.ceiling(40));
        System.out.println(ts.floor(40));

        //if element are present in the collection print same value of the output
        System.out.println(ts.ceiling(50));
        System.out.println(ts.floor(50));
    }
}
