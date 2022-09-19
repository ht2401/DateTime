package timeexercises;

import java.time.LocalDate;

public class Time26 {
    public static void main(String[] args) {
        LocalDate timeNow = LocalDate.now();
        int monthNow = timeNow.getMonth().getValue();
        System.out.println("thang hien tai la " + monthNow);
        LocalDate endMonth = timeNow.withDayOfMonth(timeNow.lengthOfMonth());
        System.out.println("thoi luong cua thang la " + endMonth);
        if (1 <= monthNow & monthNow <= 3) {
            System.out.println("thang dau cua quy la thang 1");
        } else if (4 <= monthNow & monthNow <= 6) {
            System.out.println("thang dau cua quy la thang 4");
        } else if (7 <= monthNow & monthNow <= 9) {
            System.out.println("thang dau cua quy la thang 7");
        } else {
            System.out.println("thang dau cua quy la thang 10");
        }
    }
}
