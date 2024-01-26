class Demo
{
    static void display1()
    {
        System.out.println("Static Method");
    }
    void display2()
    {
        System.out.println("Non Static Method");
    }

}
public class StaticSecond {
    public static void main(String[] args) {
        Demo.display1();  //Direct call with the name of static method own class

        Demo d = new Demo();
        d.display1();  //call with the help of object of class
        d.display2();
    }
}
