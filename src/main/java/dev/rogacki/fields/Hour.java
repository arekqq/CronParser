package dev.rogacki.fields;

public record Hour(String value) implements LinePrinter {
    @Override
    public String getNameColumn() {
        return fillUpToColumns("hour");
    }

    @Override
    public String getTimes() {
        return "";
    }
}
