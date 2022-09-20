package timeexercises;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time5 {
    public static void main(String[] args) {
        LocalDateTime minYear = LocalDateTime.MAX;
        LocalTime minMonth = LocalTime.MAX;
        System.out.println(minYear + " " + minMonth);
        System.out.println(minMonth);
    }
}
