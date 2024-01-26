class Student {
    private int age;
    private String name;
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class Demo {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();
        obj.setAge(34);
        obj1.setAge(21);
        obj.setName("Pradeep");
        obj1.setName("Rahul");
        int Std1 = obj.getAge();
        int Std2 = obj1.getAge();
        String std1 = obj.getName();
        String std2 = obj1.getName();
        System.out.println(Std1 + " " + std1);
        System.out.println(Std2 + " " + std2);
    }
}
