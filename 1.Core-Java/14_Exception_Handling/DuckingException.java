// Handling Vs Ducking Exception (in this concept we are using throws keyword for depending upon the other method or class to solve the Exception)
class Demo
{
    public void a() throws Exception
    {
        b();
    }

    public void b() throws Exception 
    {
        int num1 = 23;
        int num2 = 0;
        int result = num1 / num2;
        System.out.println(result);
    }
}
public class DuckingException {
    //throws keyword also use in main method but JVM not soving the Exception
    public static void main(String[] args) 
    {
        Demo obj = new Demo();
        try
        {

            obj.a();
        }
        catch(Exception e)
        {
            System.out.println("error" + e.getMessage());
        }
    }
}
