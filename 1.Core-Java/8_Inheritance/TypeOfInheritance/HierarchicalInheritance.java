package TypeOfInheritance;
class Animal
{
    void sleep()
    {
        System.out.println("Animals needs to sleep");
    }
}
class Tigers extends Animal
{

}
class Monkey extends Animal
{

}
class Lion extends Animal
{

}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Tigers t = new Tigers();
        t.sleep();
        Monkey m = new Monkey();
        m.sleep();
        Lion l = new Lion();
        l.sleep();
    }
}
