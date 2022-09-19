package timeexercises;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class EndOfTheWeek9 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate monday = today;
        while (today.getDayOfWeek() != DayOfWeek.MONDAY) {
            monday = monday.minusDays(1);
        }

        LocalDate sunday = today;
        while (sunday.getDayOfWeek() != DayOfWeek.SUNDAY) {
            sunday = sunday.plusDays(1);
        }

        System.out.println("Today: " + today);
        System.out.println("Monday of the Week: " + monday);
        System.out.println("Sunday of the Week: " + sunday);
    }
}
