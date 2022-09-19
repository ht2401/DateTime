package timeexercises;

import java.time.LocalDate;

public class Time7 {
    public static void main(String[] args) {
        LocalDate timeNow = LocalDate.now();
        System.out.println("time now : " + timeNow);
        LocalDate endMonth = timeNow.withDayOfMonth(timeNow.lengthOfMonth());
        System.out.println("ngay cuoi cung cua thang hien tai la : " + endMonth);
    }
}
