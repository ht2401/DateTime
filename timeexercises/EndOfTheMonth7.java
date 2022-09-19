package timeexercises;

import java.time.LocalDate;
import java.util.Scanner;

public class EndOfTheMonth7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time : ");
        LocalDate dateTimeInput = LocalDate.parse(scanner.nextLine());
        LocalDate firstOfThisMonth = dateTimeInput.withDayOfMonth(1);
        LocalDate firstOfLastMonth = firstOfThisMonth.minusMonths(0);
        LocalDate endOfLastMonth = dateTimeInput.withDayOfMonth(dateTimeInput.lengthOfMonth());
        System.out.println("end of last month: " + firstOfLastMonth + "thu " + firstOfLastMonth.getDayOfWeek());
        System.out.println("end of last month: " + endOfLastMonth + "thu " + endOfLastMonth.getDayOfWeek());
    }
}
