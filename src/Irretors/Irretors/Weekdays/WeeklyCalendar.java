package Irretors.Irretors.Weekdays;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class WeeklyCalendar {

    private List<WeeklyEntry> entries;

    public WeeklyCalendar() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String weekday, String notes) {
        WeeklyEntry entry = new WeeklyEntry(weekday, notes);
        entries.add(entry);
    }

    public Iterable<WeeklyEntry> getWeeklySchedule() {
        Collections.sort(entries,WeeklyEntry.getComparatorByWeekday());
        return this.entries;
    }
}
