package AutomaticPromationInOverloading;

public class Test1 {
    public void m1(String s)
    {
        System.out.println("String arg method");
    }
    public void m1(StringBuffer b)
    {
        System.out.println("String Buffer arg method");
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.m1("ritik");
        t.m1(new StringBuffer("dhoni"));
//        t.m1(null);  reference to m1 is ambiguous
//        both method m1(java.lang.String) in AutomaticPromationInOverloading.Test1 and method m1(java.lang.StringBuffer) in AutomaticPromationInOverloading.Test1 match
    }
}
