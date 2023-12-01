package coding_kata.coding_kata_oct_25;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event {

    private String name;
    private String description;
    private Duration duration;
    private LocalDateTime startTime;
    private LocalDateTime endTime;


    private EventState state;

    public Event(String name, LocalDateTime startTime) {
        this.name = name;
        this.description = "";
        this.duration = Duration.ofHours(1);
        setStartTime(startTime);
        calculateState();

        /// code
        /// code
        /// code
        /// code
        /// code
        /// code
        /// code
        /// code
        /// code
        /// code
        /// code

    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
        duration = Duration.between(startTime,endTime);
    }

    public Duration calculateOvertime(){
        return Duration.between(LocalDateTime.now(), endTime);
    }

    public void calculateState(){
        if(LocalDateTime.now().isBefore(startTime)){
            state = EventState.UPCOMING;
        } else if (LocalDateTime.now().isBefore(startTime.plus(duration))){
            state = EventState.ONGOING;
        } else {
            state = EventState.FINISHED;
        }
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public EventState getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
        endTime = startTime.plus(duration);
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
        endTime = startTime.plus(duration);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm");
        String start = startTime.format(formatter);
        String end = endTime.format(formatter);
        String durationStr = duration.toString();
        durationStr = durationStr.substring(2,durationStr.length()-1) + " H";

        return "Event{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", duration=" +  durationStr +
                ", startTime=" + start +
                ", endTime=" + end +
                ", state=" + state +
                '}';
    }
}
