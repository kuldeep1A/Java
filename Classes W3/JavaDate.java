import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class JavaDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(datetime);

        System.out.println("-");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String datetimeF = datetime.format(formatter);
        System.out.println(datetimeF);
    }
}

//Value	        Example
//yyyy-MM-dd	"1988-09-29"
//dd/MM/yyyy	"29/09/1988"
//dd-MMM-yyyy	"29-Sep-1988"
//E, MMM dd yyyy	"Thu, Sep 29 1988"