package dev.rogacki.fields;

public record DayOfWeek(String value) implements TimeRange, LinePrinter {

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

    @Override
    public String getValue() {
        return getTimes();
    }
}
