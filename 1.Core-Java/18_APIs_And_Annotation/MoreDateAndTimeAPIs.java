import java.time.*;
public class MoreDateAndTimeAPIs {
    public static void main(String[] args) {
        
        //It is Date APIs
        LocalDate date = LocalDate.now();
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();
        System.out.println(day + "/" + month + "/" + year);

        //It is Time APIs
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        int min = time.getMinute();
        int sec = time.getSecond();
        int nonoSec = time.getNano();
        System.out.println(hour+"/"+min+"/"+sec+"/"+nonoSec);
    }
}
