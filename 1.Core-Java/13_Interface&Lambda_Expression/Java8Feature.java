interface Demo1
{
    void show();
    default void config()  //With the help of default keyword we can implement the body of method in interface
    {
        System.out.println("in Config");
    }
    static void abc() //Same as a default keyword but with the help of static keyword we don't create any Object in main method
    {
        System.out.println("In abc");
    }
}
class Demo2 implements Demo1
{
    public void show()
    {
        System.out.println("in show");
    }
}
public class Java8Feature {
    public static void main(String[] args) {
        Demo1.abc();  //without creating any object we can call the method of interface but not default keyword method
        Demo1 d = new Demo2();
        d.show();
        d.config(); //
    }
}
