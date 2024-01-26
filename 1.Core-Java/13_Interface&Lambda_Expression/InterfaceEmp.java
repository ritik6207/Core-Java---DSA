interface Computer
{
    void compileCode();
}
class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("You got 5 errors");
    }
}
class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("You got 10 errors");
    }
}
class Developer
{
    public void buildApp(Computer cp)
    {
        System.out.println("Building App");
        cp.compileCode();
    }
}
public class InterfaceEmp {
    public static void main(String[] args) {
        Computer c = new Laptop();
        Developer dev = new Developer();
        dev.buildApp(c);
    }
}
