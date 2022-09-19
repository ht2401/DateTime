package timeexercises;

import java.time.LocalDate;
import java.time.LocalTime;

public class Time40 {
    public static void main(String[] args) {
        LocalDate dayNow = LocalDate.now();
        System.out.println("ngay hien tai : " + dayNow);
        LocalTime timeNow = LocalTime.now();
        System.out.println("gio hien tai : " + timeNow);
    }
}
