package InnerClass;
interface Car
{
    void drive();
}
public class AnonymousClass_ThirdType {
    public static void main(String[] args) {
        Car c = new Car()
        {                               //Anonymous inner class , When create a method in interface and use only one time then we will use Anonymous inner class
            public void drive()
            {
                System.out.println("Driving...");
            }
        };
        c.drive();
    }
}
