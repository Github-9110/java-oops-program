import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {
    
    public static void main(String args[]){
        LocalDate obj = LocalDate.now();
        LocalTime obj1 = LocalTime.now();
        LocalDateTime obj2 = LocalDateTime.now();
        DateTimeFormatter obj3 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = obj2.format(obj3);

        System.out.println("Current Date = "+obj);
        System.out.println("Current Time = "+obj1);
        System.out.println("Current DateTime = "+obj2);
        System.out.println("Current formated DateTime = "+formattedDate);
    }
}

