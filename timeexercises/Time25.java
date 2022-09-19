package timeexercises;

import java.time.LocalDate;

public class Time25 {
    public static void main(String[] args) {
        LocalDate timeNow = LocalDate.now();
        int yearNow = timeNow.getYear();
        System.out.println("nam hien tai la : " + yearNow);
        if (Time18.isLeapYear(yearNow) == true) {
            System.out.println("la nam nhuan");
            System.out.println("thoi gian trong nam la 366 ngay");
        } else {
            System.out.println("khong la nam nhuan");
            System.out.println("thoi gian trong nam la 365 ngay");
        }
    }
}
