package coding_kata.coding_kata_oct_25;

import java.time.Duration;
import java.time.LocalDateTime;

public class TestingCalendarApp {

    public static void main(String[] args) {
        Event event = new Event("Sabi's Wedding", LocalDateTime.now().minusHours(2));
        event.setDuration(Duration.ofHours(3));
        System.out.println(event.toString());
    }
}
