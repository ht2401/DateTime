package timeexercises;

import java.time.LocalDate;
import java.time.Period;

public class Time30 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2022, 1, 15);
        LocalDate endDate = LocalDate.of(2011, 3, 18);
        Period different = Period.between(startDate, endDate);
        System.out.println("su chenh lech giua ngay bat dau vaf ngay ket thuc la " + different.getYears() + " năm " + different.getMonths() + " tháng và " + different.getDays() + " ngày.");
    }
}
