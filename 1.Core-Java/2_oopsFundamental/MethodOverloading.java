public class MethodOverloading {
    public void m1()
    {
        System.out.println("Zero arg method");
    }
    public void m1(int i)
    {
        System.out.println("int agr method");
    }
    public void m1(double d)
    {
        System.out.println("Double arg method");
    }
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.m1();
        m.m1(10);
        m.m1(10.3);
    }
}
