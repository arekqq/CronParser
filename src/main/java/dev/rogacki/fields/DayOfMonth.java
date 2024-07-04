package dev.rogacki.fields;

public record DayOfMonth(String value) implements LinePrinter {
    @Override
    public String getNameColumn() {
        return fillUpToColumns("day of month");
    }

    @Override
    public String getTimes() {
        return "";
    }
}
