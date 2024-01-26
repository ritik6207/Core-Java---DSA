package TypeOfInheritance;
class Demo1
{
    void disp()
    {
        System.out.println("Display written in Demo1");
    }
}
class Demo2 extends Demo1
{
    void disp1()
    {
        System.out.println("Display written in Demo2");
    }
}
class Demo3 extends Demo2
{

}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Demo3 d = new Demo3();
        d.disp();
        d.disp1();
    }
}
