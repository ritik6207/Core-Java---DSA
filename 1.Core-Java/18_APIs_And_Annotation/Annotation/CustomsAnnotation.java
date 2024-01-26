package Annotation;
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayers{
    String country() default "India";
    int age() default 35;
}
@CricketPlayers
class Virat
{
    @CricketPlayers
    private int innings;
    private int runs;
    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }
}
public class CustomsAnnotation {
    public static void main(String[] args) {

        Virat v = new Virat();
        v.setInnings(300);
        v.setRuns(18000);
        System.out.println(v.getInnings() + " : " + v.getRuns());

        Class c = v.getClass();
        Annotation a = c.getAnnotation(CricketPlayers.class);
        CricketPlayers cp = (CricketPlayers)a;

        String country = cp.country();
        int age = cp.age();
        System.out.println(country + " : " + age);
    }
}
