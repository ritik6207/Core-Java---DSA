public class Static {
    static int age;  //Static variable , first execution

    static {   // Static block , second execution
        age = 20;
        System.out.println("Static block");
        System.out.println(age);
    }

    static void display() //Static method 4th execution , when call in main method
    {
        System.out.println("Static method , When call in main method");
    }
    public static void main(String[] args) {   //main method , 3rd execution then Static method execution then non-Static execution
        System.out.println("Main method");
        display();
    }
}
