package dev.rogacki.fields;

public record DayOfMonth(String value) implements TimeRange, LinePrinter {
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
        return ""; // TODO
    }

    @Override
    public String getValue() {
        return getTimes();
    }
}
