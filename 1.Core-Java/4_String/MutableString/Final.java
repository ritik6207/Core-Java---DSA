package MutableString;

public class Final {
    public static void main(String[] args) {
       final StringBuffer sb = new StringBuffer("Virat");
        sb.append(" Kohali");
        System.out.println(sb);
//        sb = new StringBuffer("Dhoni");   //cannot assign a value to final variable sb, because we use final in previus variable sb
        System.out.println(sb);
    }
}
