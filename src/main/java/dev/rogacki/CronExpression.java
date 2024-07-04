package dev.rogacki;

import dev.rogacki.fields.Command;
import dev.rogacki.fields.DayOfMonth;
import dev.rogacki.fields.DayOfWeek;
import dev.rogacki.fields.Hour;
import dev.rogacki.fields.LinePrinter;
import dev.rogacki.fields.Minute;
import dev.rogacki.fields.Month;

import java.util.stream.Stream;

public record CronExpression(
    Minute minute,
    Hour hour,
    DayOfMonth dayOfMonth,
    Month month,
    DayOfWeek dayOfWeek,
    Command command
) {

    public CronExpression(String[] args) {
        this(
            new Minute(args[0]),
            new Hour(args[1]),
            new DayOfMonth(args[2]),
            new Month(args[3]),
            new DayOfWeek(args[4]),
            new Command(args[5]));
    }

    public void printOutput() {
        streamAllTimePrinters().forEach(LinePrinter::printLine);
    }

    private Stream<LinePrinter> streamAllTimePrinters() {
        return Stream.of(minute, hour, dayOfMonth, month, dayOfWeek, command);
    }
}
