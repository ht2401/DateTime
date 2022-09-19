package timeexercises;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeNewYork5 {
    public static void main(String[] args) {
        ZonedDateTime nYZonedDateTime = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("time now in New York : " + nYZonedDateTime);
    }
}
