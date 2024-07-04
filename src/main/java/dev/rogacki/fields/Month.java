package dev.rogacki.fields;

public record Month(String value) implements LinePrinter {

    @Override
    public String getNameColumn() {
        return fillUpToColumns("month");
    }

    @Override
    public String getTimes() {
        return "";
    }
}
