package dev.rogacki.fields;

public record Minute(String value) implements LinePrinter {

    @Override
    public String getNameColumn() {
        return fillUpToColumns("minute");
    }

    @Override
    public String getTimes() {
        return "";
    }
}
