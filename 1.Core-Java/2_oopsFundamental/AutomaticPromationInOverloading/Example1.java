package AutomaticPromationInOverloading;

public class Example1 {
    public void m1(int i)
    {
        System.out.println("int arg method");
    }
    public void m1(float f)
    {
        System.out.println("Float arg method");
    }
    public static void main(String[] args) {
        Example1 e = new Example1();
        e.m1('a');
        e.m1(10l);
//        e.m1(10.5);
    }
}
