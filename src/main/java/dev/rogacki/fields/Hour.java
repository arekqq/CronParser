package dev.rogacki.fields;

public record Hour(String value) implements TimeRange {

    private static final int MAX = 24;

    @Override
    public String getNameColumn() {
        return fillUpToColumns("hour");
    }

    @Override
    public int getMax() {
        return MAX;
    }
}
