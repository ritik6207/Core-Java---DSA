public class InbuiltMethods {
    public static void main(String[] args) {
        String s1 = "pw java skill";
        System.out.println(s1.toUpperCase());
        String s2 = "PW JAVA SKILL";
        System.out.println(s2.toLowerCase());
        System.out.println(s2.length());
        System.out.println(s2.charAt(3));
        System.out.println(s2.substring(3, 7));
        System.out.println(s2.indexOf("J"));
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.lastIndexOf("a"));
    }
}
