package practiceJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderExample {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d/M/yyyy");
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendar.get(Calendar.AM_PM));
    }
}
