package Annotation;

@FunctionalInterface
interface Demo
{
    void dis();
//    void dis1();
}
@Deprecated
class Plane
{
    public void PlaneFliesAtGoodHeight()
    {
        System.out.println("Plane is Flying");
    }
}
class CargoPlane extends Plane
{
    @Override  //Annotation
    public void PlaneFliesAtGoodHeight()
    {
        System.out.println("Cargo Plane Flying");
    }
}
public class IntroAnnotation {
    public static void main(String[] args) {
        Plane cp = new CargoPlane();
        cp.PlaneFliesAtGoodHeight();

    }
}
