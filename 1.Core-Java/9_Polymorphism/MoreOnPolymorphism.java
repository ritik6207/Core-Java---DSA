class AeroPlanes
{
    public void takeOff()
    {
        System.out.println("AeroPlane is Take Off");
    }
    public void fly()
    {
        System.out.println("AeroPlane is Flies");
    }
}
class CargoPlanes extends AeroPlanes
{
    public void takeOff()
    {
        System.out.println("CargoPlane required to Longer Runway");
    }
    public void fly()
    {
        System.out.println("CargoPlane flies Small Altitude");
    }
}
class PassengerPlanes extends AeroPlanes
{
    public void takeOff()
    {
        System.out.println("PassengerPlanes required to Medium Runway");
    }
    public void fly()
    {
        System.out.println("PassengerPlans flies Medium Altitude");
    }
}
class FighterPlane extends AeroPlanes
{
    public void takeOff()
    {
        System.out.println("FighterPlane required to Small Runway");
    }
    public void fly()
    {
        System.out.println("FighterPlane flies Highest Altitude");
    }
}
class Airport
{
    public void poly(AeroPlanes ref)  //in this method we take reference of parent class
    {
        ref.takeOff();  //this takeOff method perform many form of class. CargoPlane class, PassengerPlane class & FighterPlane
        ref.fly(); //Same as takeOff method
        System.out.println("-------------------------------");
    }
}
public class MoreOnPolymorphism {
    public static void main(String[] args) {
        //if we are using inheritance concept then object creation time we are using parent class in child class type
//        AeroPlanes ref = new CargoPlanes();   //Here AeroPlanes is a parent class but CargoPlane is an Object

        CargoPlanes cp = new CargoPlanes();
        PassengerPlanes pp = new PassengerPlanes();
        FighterPlane fp = new FighterPlane();
        //Using polymorphism concept we reduce number of line code
       Airport a = new Airport();
       a.poly(cp);
       a.poly(pp);
       a.poly(fp);

//        cp.takeOff();
//        cp.fly();
//
//        pp.takeOff();
//        pp.fly();
//
//        fp.takeOff();
//        fp.fly();
    }
}