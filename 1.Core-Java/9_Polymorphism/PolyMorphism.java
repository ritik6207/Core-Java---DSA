class Aeroplane
{
    public void takeOff()
    {
        System.out.println("Aeroplane can takeOff");
    }
    public void fly()
    {
        System.out.println("Aeroplane can fly");
    }
}
class CargoPlane extends Aeroplane
{
    public void takeOff()
    {
        System.out.println("CargoPlane required longer runway");
    }
    public void fly()
    {
        System.out.println("CargoPlane flies Lowest medium");
    }
}
class PassengerPlane extends Aeroplane
{
    public void takeOff()
    {
        System.out.println("PassengerPlane required small runway");
    }
    public void fly()
    {
        System.out.println("PassengerPlane flies height medium");
    }
}
public class PolyMorphism {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        Aeroplane Are;

        Are = cp;
        Are.takeOff();
        Are.fly();
        System.out.println("-----------------------------------");
        Are = pp;
        Are.takeOff();
        Are.fly();
    }
}
