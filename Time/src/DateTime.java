import java.time.*;

public class DateTime {
    public static void main(String[] args){

        LocalDate today = LocalDate.now();
        System.out.println("Today's date is " + today);

        LocalTime time_now = LocalTime.now();
        System.out.println("The time now is " + time_now);

        LocalDateTime date_time_now = LocalDateTime.now();
        System.out.println("Date and Time now is " + date_time_now);

        LocalDate anniversary = LocalDate.of(2022, Month.MAY, 19);
        System.out.println("Anniversary Date: " + anniversary);

        LocalTime wake_time = LocalTime.of(9, 45);
        System.out.println("Time to wake up: " + wake_time + "am");
    }
}
