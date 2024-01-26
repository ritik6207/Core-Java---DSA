public class instanceVariable {
    int x = 10;   //if any variable is declared out of the main method it is called instance variable
    public static void main(String[] args) {
//        System.out.println(x);Compiler error, non-static variable x cannot be referenced from a static context
        instanceVariable obj = new instanceVariable();
        System.out.println(obj.x);
        obj.m1();
    }
    public void m1()
    {
        System.out.println(x);  // It is also valid
    }
}
