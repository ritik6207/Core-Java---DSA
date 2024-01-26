//import java.util.Date;
public class DateAndTimeAPIs {
    public static void main(String[] args) {
        //util package
       java.util.Date dt = new java.util.Date(); //it is defined as like an import class
        System.out.println(dt);

        //sql package
        long timeInMs = dt.getTime();
        java.sql.Date dt1 = new java.sql.Date(timeInMs);
        System.out.println(dt1);
    }
}
