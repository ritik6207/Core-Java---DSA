class Demo1
{
    static int a;    //static variable 1st execution
    static int b;

    int m;  //Instance or,non-static variable 3rd execution
    int n;

    static {       //static method 2nd execution
        a = 10;
        b = 20;
        System.out.println("Control in static block");
    }

    {      //4th execution
        m = 29;
        n = 12;
        System.out.println("Control in non static block");
    }

    static void display()   //5th execution
    {
        System.out.println("value of Static variable A is " + a);
        System.out.println("value of Static variable B is " + b);
    }

    void display1()   //6th execution
    {
        System.out.println("value of instance or object variable M is " + m);
        System.out.println("value of instance of object variable N is " + n);
    }
}
public class StaticThird {
    public static void main(String[] args) {
        System.out.println("Main method");
        Demo1 d = new Demo1();
        Demo1.display();
        d.display1();
    }
}
