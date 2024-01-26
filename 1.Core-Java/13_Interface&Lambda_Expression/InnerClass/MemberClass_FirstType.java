package InnerClass;
//Inner class there aer three type:- member class, static class, Anonymous class
class A
{
    public void show()
    {
        System.out.println("in show");
    }
    class B      //member inner class ,
    {
        public void xyz()
        {
            System.out.println("in xyz");
        }
    }
}
public class MemberClass_FirstType {
    public static void main(String[] args) {
        //creating object of class A
        A obj = new A();
        obj.show();
        //creating object of member inner class B
        A.B obj1 = obj.new B();  //if we are creating member inner class B object, we use reference variable of (outer) class A
        obj1.xyz();
    }
}
