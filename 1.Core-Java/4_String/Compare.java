public class Compare {
    public static void main(String[] args) {
//        String s1 = "Pwskills";
//        String s2 = new String("Pwskills");
//        System.out.println(s1 == s2);    //Compare with String reference based on Heap Memory
//        System.out.println(s1.equals(s2));   //Compare with String value

       /* String s1 = "pwjava";
        String s2 = "pwjava";
        String s3 = "pwJAVA";
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s1);
        System.out.println();
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s1));  */

       /* String s1 = "pwjava";
        String s2 = new String("pwjava");
        String s3 = new String("pwjava");
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);  */

       /* String s1 = "ritik";
        String s2 = new String("ritik");
        String s3 = new String("ritik");
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println();
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));  */

       /* String s1 = "ritik";
        String s2 = new String("Ritik");
        String s3 = new String("ritik");
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println();
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));*/

        //Ignore Case
        String s1 = "ritik";
        String s2 = new String("RitIk");
        String s3 = new String("ritik");
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println();
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.equalsIgnoreCase(s3));
    }
}
