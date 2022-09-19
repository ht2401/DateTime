package timeexercises;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Time33 {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate.getDayOfWeek() + " " + nowDate.getDayOfMonth() + "/"+ nowDate.getMonth() + "/" + nowDate.getYear());
        LocalDate previousDay = nowDate.with(TemporalAdjusters.previous(DayOfWeek.SATURDAY));
        LocalDate nextDay = nowDate.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("ngay thu 6 tuan truoc la  " + previousDay);
        System.out.println("ngay thu 6 tuan sau la  " + nextDay);
    }
}
