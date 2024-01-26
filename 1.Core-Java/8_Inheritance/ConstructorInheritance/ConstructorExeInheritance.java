package ConstructorInheritance;
class Demo1
{
    int a, b;
    public Demo1()
    {
        System.out.println("Parent class Constructor");
    }
    public Demo1(int x, int y)
    {
        System.out.println("Parametrized parent class Constructor");
        a = x;
        b = y;
    }
}
class Demo2 extends Demo1
{
    int m, n;
    public Demo2()
    {
        //By Default invoked super() method, Super() method calling parent class of constructor
//        super(12,45);
        this(12,34);
        System.out.println("Child class Constructor");
    }
    public Demo2(int x, int y)
    {
        System.out.println("Parametrized child class Constructor");
        m = x;
        n = y;
    }
}
public class ConstructorExeInheritance {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
//          Demo2 d = new Demo2(12, 34);
    }
}
