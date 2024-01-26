package TypesOfMethodInheritance;
class AeroPlane
{
    void takeOff() //if any method of parent class is not modify in child class it is called , Inherited Method
    {
        System.out.println("AeroPlane is Taking Off");
    }
    void fly() //In parent class it is called Overriden
    {
        System.out.println("AeroPlane is Flying");
    }
}
class CargoPlane extends AeroPlane
{
    void fly() //if any Method of parent class is Modify in child class ,it is called Override Method
    {
        System.out.println("CargoPlane flies at lowest height");
    }
    void carryGoods() //If any method of child class is not present in Parent class it is called ,Specialized Method
    {
        System.out.println("CargoPlane Carries Goods");
    }
}
class PassengerPlane extends AeroPlane
{
    void fly()  //Override Method
    {
        System.out.println("PassengerPlane flies at medium height");
    }
    void carryPassenger() //Specialized Method
    {
        System.out.println("PassengerPlane carries passenger");
    }
}
public class Types {
    public static void main(String[] args) {

    }
}
