package dev.rogacki.fields;

public record Command(String value) implements TimeRange {

    @Override
    public String getNameColumn() {
        return fillUpToColumns("command");
    }

    @Override
    public int getMax() {
        return 0;
    }

    @Override
    public String getTimes() {
        return value;
    }
}
