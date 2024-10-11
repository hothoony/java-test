
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test_Date_Calendar {
    
    public static void main(String[] args) {

        System.out.println();
        System.out.println(">> main begin");
        System.out.println();

        testCode();

        System.out.println();
        System.out.println(">> main end");
        System.out.println();
    }

    private static void testCode() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss.SSS");

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();

        System.out.println("date            => " + date);
        System.out.println("date format     => " + formatter.format(date));
        System.out.println("calendar        => " + calendar.getTime());
        System.out.println("calendar format => " + formatter.format(calendar.getTime()));
    }
}

// date            => Fri Oct 11 23:54:30 KST 2024
// date format     => 20241011_235430.649
// calendar        => Fri Oct 11 23:54:30 KST 2024
// calendar format => 20241011_235430.649
