package practiceJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("d/M/yyyy");
        System.out.println(simpleDateFormat1.format(date));

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("d/M/yyyy hh:mm:ss");
        System.out.println(simpleDateFormat2.format(date));
    }
}
