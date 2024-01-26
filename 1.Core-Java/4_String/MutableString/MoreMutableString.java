package MutableString;

public class MoreMutableString {
    public static void main(String[] args) {
//        StringBuffer s = new StringBuffer();
//        System.out.println(s.capacity());
//        s.append("abcdefghijklmnop");
//        System.out.println(s.capacity());
//        s.append("d");
//        System.out.println(s.capacity());   //how many character you can add
//        System.out.println(s.length());   //how many character are present

//        StringBuilder sb = new StringBuilder("TheGame");
//        System.out.println(sb.capacity());
//        System.out.println(sb.charAt(3));
//        sb.setCharAt(6, 'E');
//        System.out.println(sb);

//        StringBuffer sb = new StringBuffer(150);
//        System.out.println(sb.capacity());
//        sb.append("java");
//        System.out.println(sb);
//        sb.trimToSize();
//        System.out.println(sb.capacity());

        StringBuffer sb = new StringBuffer("javaskills");
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
