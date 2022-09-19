package timeexercises;

import java.time.LocalDateTime;
import java.time.Month;

public class Time2 {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.of(2012, 12, 12, 12, 12);
        long year = time.getYear();
        Month month = time.getMonth();
        long day = time.getDayOfMonth();
        long hour = time.getHour();
        long minute = time.getMinute();
        System.out.println("year : " + year + "month : " + month + " day : " + day + "hour : " + hour + "minute : " + minute);
    }
}
