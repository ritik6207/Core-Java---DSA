package InnerClass;
class X
{
    public void show()
    {
        System.out.println("in show");
    }
    static class Y //static inner class
    {
        public void abc()
        {
            System.out.println("in abc");
        }
    }
}
public class StaticClass_SecondType {
    public static void main(String[] args) {
        X obj = new X();
        obj.show();
        //creating object of static inner class
        X.Y obj1 = new X.Y();  //in this static inner class we are not using reference variable of class X , because class is a static
        obj1.abc();
    }
}
