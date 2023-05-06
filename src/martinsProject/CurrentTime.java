package martinsProject;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class CurrentTime {
    public static void main(String[] args) {
        Formatter format = new Formatter();
        Date current_Date = new Date();
        System.out.println(current_Date);
        System.out.println("  ");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
        System.out.println(dateFormat);

        System.out.println(LocalDateTime.now(ZoneId.of("GMT")));
        System.out.println("   ");

        Calendar calender = Calendar.getInstance();
        format = new Formatter();
        format.format("%tl:%tM", calender,
                calender);
        System.out.println(format);
    }
}
