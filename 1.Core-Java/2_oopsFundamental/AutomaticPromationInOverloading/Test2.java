package AutomaticPromationInOverloading;

public class Test2 {
    public void m1(int i, float j)
    {
        System.out.println("int , float arg method");
    }
    public void m1(float j, int i)
    {
        System.out.println("Float , int arg method");
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.m1(10, 10.5f);
        t.m1(12.4f, 45);
//        t.m1(10, 10);    // Compiler error
//        t.m1(23.5f, 56.3f); // Compiler error
    }
}
