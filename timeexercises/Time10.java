package timeexercises;

import java.time.YearMonth;

public class Time10 {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2022, 9);
        String first = yearMonth.atDay(1).getDayOfWeek().name();
        System.out.println("thu cua ngay dau tien trong thang la " + first);
        String last = yearMonth.atEndOfMonth().getDayOfWeek().name();
        System.out.println("thu cua ngay cuoi cung trong thang la " + last);
    }
}
