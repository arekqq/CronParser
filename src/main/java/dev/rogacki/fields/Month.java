package dev.rogacki.fields;

public record Month(String value) implements TimeRange {

    private static final int MAX = 13;

    @Override
    public String getNameColumn() {
        return fillUpToColumns("month");
    }

    @Override
    public int getMax() {
        return MAX;
    }

    @Override
    public String getTimes() {
        return "";
    }
}
