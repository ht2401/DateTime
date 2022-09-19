package timeexercises;

import java.time.LocalDateTime;

public class Time22 {
    public static LocalDateTime addDay(int a) {
        LocalDateTime timeNow = LocalDateTime.now();
        return timeNow.plusDays(a);
    }

    public static void main(String[] args) {
        System.out.println("thoi gian sau khi cong them 10 ngay la : " + addDay(10));
        System.out.println("thoi gian sau khi tru di 10 ngay la : " + addDay(-10));
    }
}
