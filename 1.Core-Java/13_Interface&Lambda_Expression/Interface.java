interface A    //
{
    int num = 23; //by default data type is "public static final"
    void show();  //By default, method is public and abstract, so we can't implement the body of method

}
public class Interface {
    public static void main(String[] args) {
//        A a = new A();  // We can't create object in interface
        System.out.println(A.num);
    }
}
