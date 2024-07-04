package dev.rogacki.fields;

public record DayOfWeek(String value) implements TimeRange {

    @Override
    public String getNameColumn() {
        return fillUpToColumns("day of week");
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
