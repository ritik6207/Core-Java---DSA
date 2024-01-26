interface X
{
    void show();
}
interface Y
{
    void abc();
}
class Z implements X,Y   //Multiple type in interface
{
    public void show()
    {
        System.out.println("in show");
    }
    public void abc()
    {
        System.out.println("in abc");
    }
}
public class InterfaceImp {
    public static void main(String[] args) {
//        Z obj = new Z();
//        obj.show();
//        obj.abc();

        //X obj = new Z();
        //obj.show();
//        obj.abc();  // give error

        //Y obj = new Z();
        //obj.abc();
//        obj.show();  // give error
    }
}
