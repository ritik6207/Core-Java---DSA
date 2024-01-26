class Student
{
    private int age;
    private String name;

    Student(String name, int age)   //Constructor call with the help of Object creation
    {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
public class Launch {
    public static void main(String[] args) {
        Student st = new Student("Ritik", 21);
        System.out.println(st.getAge());
        System.out.println(st.getName());
    }
}
