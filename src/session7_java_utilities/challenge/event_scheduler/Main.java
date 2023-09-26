package session7_java_utilities.challenge.event_scheduler;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        LocalDateTime dateTime;
        Event event;
//        dateTime = LocalDateTime.of(2023, 9, 20, 10, 30);
        dateTime = LocalDateTime.now().plusDays(3);
        event = new Event("Doctor's Appointment", "Check-up with Dr. Smith", dateTime, LocalDateTime.now().plusHours(1));
        scheduler.addEvent(event);
        dateTime = LocalDateTime.now().plusDays(2);
        event = new Event("Doctor's Appointment", "Check-up with Dr. Smith", dateTime, LocalDateTime.now().plusHours(1));
        scheduler.addEvent(event);
        dateTime = LocalDateTime.now().plusDays(1);
        event = new Event("Doctor's Appointment", "Check-up with Dr. Smith", dateTime, LocalDateTime.now().plusHours(1));
        scheduler.addEvent(event);
        dateTime = LocalDateTime.now().plusDays(4);
        event = new Event("Doctor's Appointment", "Check-up with Dr. Smith", dateTime, LocalDateTime.now().plusHours(1));
        scheduler.addEvent(event);
        dateTime = LocalDateTime.now().plusDays(2).minusHours(1);
        event = new Event("Doctor's Appointment", "Check-up with Dr. Smith", dateTime, LocalDateTime.now().plusHours(1));
        scheduler.addEvent(event);

        scheduler.getEventsOn(dateTime.toLocalDate());
        scheduler.getUpcomingEvents(20);
        scheduler.removeEvent("Doctor's Appointment");
        scheduler.getUpcomingEvents(20);
        scheduler.removeEvent("Pinna colladas on the beach");
        scheduler.getPendingReminders();

    }
}
