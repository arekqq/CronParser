package dev.rogacki.fields;

public record Minute(String value) implements TimeRange, LinePrinter {

    private static final int MAX = 60;

    @Override
    public String getNameColumn() {
        return fillUpToColumns("minute");
    }

    @Override
    public int getMax() {
        return MAX;
    }

    @Override
    public String getValue() {
        return getTimes();
    }

}
