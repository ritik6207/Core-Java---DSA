public class ImmutableString {
    public static void main(String[] args) {
//        String s = "Kumar";
//        System.out.println(s);
//        String s1 = new String("Ritik");
//        System.out.println(s1);

        String s1 = "Pw";
        String s2 = "Pw";
        System.out.println(s1 == s2);  //Allocated in String Constant Pool in Heap Memory
        String s3 = new String("PwSkills");
        String s4 = new String("PwSkills");
        System.out.println(s3 == s4);    //Allocated in Heap memory but not String constant pool
    }
}
