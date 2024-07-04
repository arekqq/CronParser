package dev.rogacki.fields;

public record Month(String value) implements TimeRange, LinePrinter {

    private static final int MAX = 13;
    private static final int MIN = 1;

    @Override
    public String getNameColumn() {
        return fillUpToColumns("month");
    }

    @Override
    public int getMax() {
        return MAX;
    }

    @Override
    public int getMin() {
        return MIN;
    }

    @Override
    public String getValue() {
        return getTimes();
    }
}
