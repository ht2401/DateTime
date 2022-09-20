package timeexercises;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time4 {
    public static void main(String[] args) {
        LocalDateTime minYear = LocalDateTime.MIN;
        LocalTime minMonth = LocalTime.MIN;
        System.out.println(minYear + " " + minMonth);
        System.out.println(minMonth);
    }
}
