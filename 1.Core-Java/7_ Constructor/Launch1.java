class Demo
{
    private int a;
    private int b;

    public Demo()
    {

        System.out.println("Zero parametrized Constructor calling by programmer");
    }

    public Demo(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    void display()
    {
        System.out.println("value of a " + a);
        System.out.println("Value of b " + b);
    }
}
public class Launch1 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.display();
        Demo d2 = new Demo(10, 30);
        d2.display();
    }
}
