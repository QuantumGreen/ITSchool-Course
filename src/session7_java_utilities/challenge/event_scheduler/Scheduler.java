package session7_java_utilities.challenge.event_scheduler;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Scheduler {

    public List<Event> events;

    public Scheduler() {
        events = new ArrayList<>();
    }

    public void addEvent(Event e) {
        LocalDateTime eventDateTime = e.getEventDateTime();

        Comparator<Event> eventComparator = new Comparator<Event>() {
            @Override
            public int compare(Event o1, Event o2) {
                return o1.getEventDateTime().compareTo(o2.getEventDateTime());
            }
        };

        int insertionIndex = Collections.binarySearch(events, e, eventComparator);
        if (insertionIndex < 0) {
            insertionIndex++;
            insertionIndex *= -1;
        }
        events.add(insertionIndex, e);
    }

    public Event removeEvent(String eventName) {
        Event result = null;
        for (int i = 0; i < events.size(); i++) {
            if (eventName.equals(events.get(i).getEventName())) {
                result = events.remove(i);
                break;
            }
        }
        if (result != null) {
            System.out.print("Removed ");
            result.Display();
        } else {
            System.out.println("No " + eventName + " event found");
        }
        return result;
        //i could have a hashmap that stores lists of event indices where the key is eventNames
    }

    public List<Event> getUpcomingEvents(int n) {
        n = Math.max(n, 0);
        n = Math.min(n, events.size());

        List<Event> result = events.subList(0, n);
        System.out.println("Next " + n + " events:");
        for (Event res : result) {
            System.out.print("\t");
            res.Display();
        }
        return result;
    }

    public List<Event> getEventsOn(LocalDate date) {
        List<Event> result = new ArrayList<>();
        for (Event event : events) {
            LocalDate eventDate = event.getEventDateTime().toLocalDate();
            if (eventDate.isEqual(date)) {
                result.add(event);
            }
        }
        System.out.println("On " + date + " you have these envents:");
        for (Event res : result) {
            System.out.print("\t");
            res.Display();
        }
        return result;
    }

    public List<Event> getPendingReminders() {
        List<Event> result = new ArrayList<>();
        LocalDateTime nextday = LocalDateTime.now().plusDays(1);
        for (Event event : events) {
            if (Duration.between(event.getReminderDateTime(), nextday).toDays() == 0) {
                result.add(event);
            }
        }
        System.out.println("In the next 24 hours you have the next reminders");
        for (Event res : result) {
            LocalDate date = res.getReminderDateTime().toLocalDate();
            LocalTime time = res.getReminderDateTime().toLocalTime();
            System.out.println("\t You have a reminder of " + res.getEventName() + " on " + date + " at " + time);
//            res.Display();
        }
        return result;
    }
}
