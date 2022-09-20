package timeexercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time41 {
    public static void main(String[] args) {
        LocalDateTime timeNow = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(timeNow);
    }
}
