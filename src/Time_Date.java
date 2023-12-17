import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Date {
    public static void main(String[] args){
        LocalDate mydate = LocalDate.now();
        System.out.println(mydate);

        LocalTime mytime = LocalTime.now();
        System.out.println(mytime);

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);

        DateTimeFormatter newdate = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

        String newDateTime = datetime.format(newdate);
        System.out.println(newDateTime);

    }
}
