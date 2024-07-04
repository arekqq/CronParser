package dev.rogacki.fields;

public record DayOfWeek(String value) implements LinePrinter {
    @Override
    public String getNameColumn() {
        return fillUpToColumns("day of week");
    }

    @Override
    public String getTimes() {
        return "";
    }
}
