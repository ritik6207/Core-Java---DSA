class Human  //Super class // Base class // Parent class
{
    int age = 18;
    void sleep()
    {
        System.out.println("Human need's to sleep");
        System.out.println(age);
    }
}

class Student //Derived class // sub class // child class
        extends Human
{

}
public class Inheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.sleep();
    }
}
