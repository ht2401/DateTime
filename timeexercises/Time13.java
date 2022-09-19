package timeexercises;

import java.time.LocalDate;

public class Time13 {
    public static void main(String[] args) {
        LocalDate time13 = LocalDate.of(2000, 10, 3);
        String day = String.valueOf(time13.getDayOfWeek());
        System.out.println("thu : " + day);
    }
}
