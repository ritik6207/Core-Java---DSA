//final class Animal   //if class is final then we cannot use inheritance
//{
//    void sleep()
//    {
//        System.out.println("Animal need to sleep");
//    }
//}
class Animal
{
    final public int age = 10;
    final void sleep()
    {
//        age = 23; //if instance variable is final then we can not reassign
        System.out.println("Animal need to sleep");
    }
}
class Tiger extends Animal
{
//    void sleep()  //if method of parent is Final method then we cannot Override in child class
//    {
//
//    }
}
public class FinalKeyword {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();
    }
}
