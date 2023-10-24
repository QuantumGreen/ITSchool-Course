package session15.practice.enums;

public enum Day {
    MONDAY(true),
    TUESDAY(true),
    WENESDAY(true),
    SATURDAY(false);

    private boolean isWeekDay;

    Day(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }

    public boolean isWeekDay() {
        return isWeekDay;
    }
}
