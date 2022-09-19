package timeexercises;

import java.time.Duration;
import java.time.LocalDateTime;

public class Time38 {
    public static void main(String[] args) {
        LocalDateTime startDate = LocalDateTime.of(2027, 12, 1, 4, 20, 39);
        LocalDateTime endDate = LocalDateTime.of(2027, 11, 1, 10, 1, 8);
        long differentInSeconds = Duration.between(startDate, endDate).getSeconds();
        long differentInHours = Duration.between(startDate, endDate).toHours();
        long differentInMinutes = Duration.between(startDate, endDate).toMinutes();
        System.out.println("Sự chênh lệch giữa startDate và endDate là " + differentInSeconds + " giây tương ứng với " + differentInMinutes + " phút và tương ứng với " + differentInHours + " giờ.");
    }
}
