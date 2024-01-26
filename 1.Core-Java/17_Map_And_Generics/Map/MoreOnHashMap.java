package Map;

import java.util.*;
import java.util.Map.*;

class Student {
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String toString() {
        return name + " " + age + " " + city;
    }
}

public class MoreOnHashMap {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Student s1 = new Student("Ritik", 20, "Amarpur");
        Student s2 = new Student("Supriya", 22, "Bhagalpur");
        Student s3 = new Student("Mukesh", 25, "Banka");

        Map m = new HashMap();

        m.put(1, s1);
        m.put(2, s2);
        m.put(3, s3);

        System.out.println(m);

        Set s = m.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            Map.Entry data = (Entry) itr.next();
            System.out.println(data.getKey() + " " + data.getValue());
        }
    }
}
