package timeexercises;

import java.time.LocalDateTime;

public class Time15 {
    public static LocalDateTime addHour(int a) {
        LocalDateTime timeNow = LocalDateTime.now();
        return timeNow.plusHours(a);
    }

    public static void main(String[] args) {
        System.out.println("thoi gian sau khi cong them h la : " + addHour(1000));
    }
}
