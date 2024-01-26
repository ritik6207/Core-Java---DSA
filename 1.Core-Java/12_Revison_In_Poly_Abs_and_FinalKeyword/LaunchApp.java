import java.util.Scanner;

class Rectangle
{
    float length;
    float breadth;
    float area;
    public void input()
    {
        System.out.println("Calculation of Rectangle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the length of Rectangle");
        length = sc.nextFloat();
        System.out.println("Please Enter the beardth of Rectangle");
        breadth = sc.nextFloat();
    }
    public void compute()
    {
        area = length * breadth;
    }
    public void display()
    {
        System.out.println("Area of Rectabgle : " + area);
    }
}
class Squire
{
    float length;
    float area;
    public void input()
    {
        System.out.println("Calculation of Squire");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the length of Squire");
        length = sc.nextFloat();
    }
    public void compute()
    {
        area = length * length;
    }
    public void display()
    {
        System.out.println("Area of Squire : " + area);
    }
}
class Circle
{
    float radious;
    float area;
    public void input()
    {
        System.out.println("Calculation of Circle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the radious of Circle");
        radious = sc.nextFloat();
    }
    public void compute()
    {
        area = 3.141f * radious * radious;
    }
    public void display()
    {
        System.out.println("Area of Circle : " + area);
    }
}

public class LaunchApp {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.input();
        r.compute();
        r.display();
        Squire s = new Squire();
        s.input();
        s.compute();
        s.display();
        Circle c = new Circle();
        c.input();
        c.compute();
        c.display();
    }    
}
