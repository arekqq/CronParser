package dev.rogacki.fields;

public record DayOfMonth(String value) implements TimeRange {
    @Override
    public String getNameColumn() {
        return fillUpToColumns("day of month");
    }

    @Override
    public int getMax() {
        return 0;
    }

    @Override
    public String getTimes() {
        return "";
    }
}
