package Irretors.Irretors.Weekdays;

import java.util.Comparator;

public class WeeklyEntry {

    public static final Comparator<WeeklyEntry> BY_WEEKDAY = getComparatorByWeekday();

    private Weekday weekday;
    private String notes;

    public WeeklyEntry(String weekday, String notes) {
        this.weekday = Weekday.valueOf(weekday.toUpperCase());
        this.notes = notes;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.weekday, this.notes);
    }

    public static Comparator<WeeklyEntry> getComparatorByWeekday() {
        return (e1, e2) -> Integer.compare(e1.weekday.ordinal(), e2.weekday.ordinal());
    }
}