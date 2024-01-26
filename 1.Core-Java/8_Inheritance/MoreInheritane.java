import javax.xml.namespace.QName;

class Human1
{
    private String name; // Private modifire is not allow in inheritance
    int age = 18;
    Human1()  // Constructor is also not inherited
    {
        System.out.println("Humans1 class contructor");
    }
    void sleep()
    {
        System.out.println("Humans need sleep");
        System.out.println(age);
    }
}

class Student1 extends Human1
{
//    public Student1()   //Constructor is called in Student class not Humans class
//    {
//        //super();   // super method always called parent class of constructor not Student class
//    }
    void disp()
    {
        System.out.println("The age is " + age);
//        System.out.println("The name is " + name);  // not inheritance because name is private
    }
}
public class MoreInheritane {
    public static void main(String[] args) {
        Student1 st = new Student1();
        st.sleep();
        st.disp();
    }
}
