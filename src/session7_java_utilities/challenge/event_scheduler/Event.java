package session7_java_utilities.challenge.event_scheduler;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Event {
    private String eventName;
    private String eventDescription;
    private LocalDateTime eventDateTime;
    private LocalDateTime reminderDateTime;

    public Event(String eventName, String eventDescription, LocalDateTime eventDateTime, LocalDateTime reminderDateTime) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDateTime = eventDateTime;
        this.reminderDateTime = reminderDateTime;
    }

    public Duration timeUntilEvent(){
        return Duration.between(LocalDateTime.now(),eventDateTime);
    }
    public Duration timeUntilReminder(){
        return Duration.between(LocalDateTime.now(),eventDateTime);
    }

    public void Display(){
        LocalDate date = eventDateTime.toLocalDate();
        LocalTime time = eventDateTime.toLocalTime();
        System.out.println(eventName + " on " + date + " at " + time);
    }

    // getters and setters
    // it would be better to just have the properties set as public in this case

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public LocalDateTime getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(LocalDateTime eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public LocalDateTime getReminderDateTime() {
        return reminderDateTime;
    }

    public void setReminderDateTime(LocalDateTime reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }
}
