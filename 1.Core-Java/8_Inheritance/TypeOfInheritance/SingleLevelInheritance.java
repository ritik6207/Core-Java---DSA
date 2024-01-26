package TypeOfInheritance;
class Animals
{
    void Sleep()
    {
        System.out.println("Animals needs to sleep");
    }
}
class Tiger extends Animals  //Extends keyword is used for referred Another class
{
    //Behind the sense Sleep() referred in this class
}
public class SingleLevelInheritance {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.Sleep();
    }
}
