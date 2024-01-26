package AutomaticPromationInOverloading;

public class test {
    public void m1(String s)
    {
        System.out.println("String arg method");
    }
    public void m1(Object o)
    {
        System.out.println("Object arg method");
    }
    public static void main(String[] args) {
        test t = new test();
        t.m1("Ritik");
        t.m1(new Object());
        t.m1(null);
    }
}
