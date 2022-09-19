package timeexercises;

import java.time.LocalDateTime;

public class Time35 {
    public static void main(String[] args) {
        LocalDateTime timeNow = LocalDateTime.now();
        int dayNow = timeNow.getDayOfMonth();
        int hourNow = timeNow.getHour();
        System.out.println("hien tai la " + hourNow + " gio cua ngay " + dayNow);
    }
}
