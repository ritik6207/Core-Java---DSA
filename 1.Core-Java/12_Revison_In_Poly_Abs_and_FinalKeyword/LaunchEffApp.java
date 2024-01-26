import java.util.Scanner;

abstract class Shape
{
    abstract public void input();
    abstract public void compute();
    float area;
    public void display()
    {
        System.out.println("The Area is : " + area);
    }
}
class Rectangle1 extends Shape
{
    float length;
    float breadth;
    public void input()
    {
        System.out.println("Calcutlation of Rectangle app");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle");
        length = sc.nextFloat();
        System.out.println("Entet breadth of Rectangle");
        breadth = sc.nextFloat();
    }
    public void compute()
    {
        area = length * breadth;
    }
}
class Squire1 extends Shape
{
    float length;
    public void input()
    {
        System.out.println("Calculation of Squire");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Squire");
        length = sc.nextFloat();
    }
    public void compute()
    {
        area = length * length;
    }
}
class Circle1 extends Shape
{
    float radious;
    final float PI = 3.141f;
    public  void input()
    {
        System.out.println("Calculatoin of Circle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radious of Circle");
        radious = sc.nextFloat();
    }
    public void compute()
    {
        area = PI * radious * radious;
    }
}
class Geometry
{
    public void poly(Shape ref)
    {
        ref.input();
        ref.compute();
        ref.display();
        System.out.println("-----------------------------");
    }
}
public class LaunchEffApp {
    public static void main(String[] args) {
        Rectangle1 rec = new Rectangle1();
        Squire1 sc = new Squire1();
        Circle1 c = new Circle1();
        Geometry g = new Geometry();
        g.poly(rec);
        g.poly(sc);
        g.poly(c);
    }
}
