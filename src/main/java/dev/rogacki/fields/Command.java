package dev.rogacki.fields;

public record Command(String value) implements LinePrinter {

    @Override
    public String getNameColumn() {
        return fillUpToColumns("command");
    }

    @Override
    public String getTimes() {
        return value;
    }
}
