import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class PrintTime3 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        
        String myTime = dt.format(df);

        System.out.println(myTime);
    }
}
