//without using extends keyword and creating any object in other class , calling dependent class in Target class
class Car   //Target class
{
    private Engin eng;
    public Car(Engin eng)  //using Constructor Injector
    {
        this.eng = eng;
    }

    public void start()
    {
        eng.enginStart();
    }
}
class Engin //Dependent class
{
    public void enginStart()
    {
        System.out.println("Car Started");
    }
}
public class DependanceyInject {
    public static void main(String[] args) {
        Engin e = new Engin();
        Car c = new Car(e);
        c.start();
    }
}
