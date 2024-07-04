package dev.rogacki.fields;

public interface LinePrinter {

    String getNameColumn();
    String getValue();

    default void printLine() {
        System.out.println(getNameColumn() + getValue());
    }

    default String fillUpToColumns(String name) {
        int spacesToAdd = getDefaultColumnWidth() - name.length();
        return name + " ".repeat(spacesToAdd);
    }

    private int getDefaultColumnWidth() {
        return 14;
    }
}
