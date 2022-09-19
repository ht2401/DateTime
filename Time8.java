package timeexercises;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Time8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        System.out.println("Nhap thang: ");
        LocalDate date = LocalDate.parse(sc.nextLine());
        int endDayOfMonth = cal.getActualMaximum(Calendar.DATE);
        System.out.println("Ngay cuoi thang la: " + endDayOfMonth);
    }
}
