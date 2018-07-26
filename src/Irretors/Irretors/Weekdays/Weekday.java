package Irretors.Irretors.Weekdays;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    @Override
    public String toString() {
        String lowerCase = super.name().toLowerCase().substring(1);
        return super.name().charAt(0) + lowerCase;
    }
}