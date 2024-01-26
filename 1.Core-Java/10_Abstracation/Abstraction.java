abstract class AeroPlane  //if nay method is abstract in class then class is must abstract
{
//    abstract int age;  //we are not using abstract in variable
//    We can not use abstract in constructor , because in constructor by default use super() method in constructor body
    abstract public void takeOff();
    //takeOff() is non - body method , so we are using abstract
    abstract public void fly();
    public void landing()
    {
        System.out.println("AeroPlane is landing");
    }
}
class CargoPlane extends AeroPlane
{
    public void takeOff()
    {
        System.out.println("CargoPlane required Large size of runway");
    }
    public void fly()
    {
        System.out.println("CargoPlane flies lower altitude");
    }
    public void alert()
    {
        System.out.println("Alert......");
    }
}
class PassengerPlane extends AeroPlane
{
    public void takeOff()
    {
        System.out.println("PassengerPlane required Medium size of runway");
    }
    public void fly()
    {
        System.out.println("PassengerPlane flies Medium altitude");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        AeroPlane ref1 = new CargoPlane();
        ref1.takeOff();
        ref1.fly();
        ref1.landing(); //inherited method
        //if we are using specialized method give error, but using Down casting don't so error
//        ref1.alert();
        ((CargoPlane) ref1).alert();  // Down Casting

        AeroPlane ref2 = new PassengerPlane();
        ref2.takeOff();
        ref2.fly();
        ref2.landing();

//        AeroPlane a = new AeroPlane();  // if class is Abstract We can not create Object their class
    }
}
