package dev.rogacki.fields;

import dev.rogacki.strategies.CronExpressionRecognizer;
import dev.rogacki.strategies.ExpressionType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface TimeRange {
    String value();
    int getMax();

    default String getValues() {
        return value().replace(",", " ");
    }

    default String getRange() {
        String[] split = value().split("-");
        return IntStream.rangeClosed(Integer.parseInt(split[0]), Integer.parseInt(split[1]))
            .mapToObj(Integer::toString)
            .collect(Collectors.joining(" "));
    }

    default String getIncrements() {
        String[] split = value().split("/");
        String first = split[0];
        int start = "*".equals(first) ? 0 : Integer.parseInt(first);
        int step = Integer.parseInt(split[1]);
        List<Integer> result = new ArrayList<>();
        for (int i = start; i < getMax() ; i+=step) {
            result.add(i);
        }
        return result.stream().map(Objects::toString).collect(Collectors.joining(" "));
    }

    default String getAll() {
        return IntStream.range(getMin(), getMax())
            .mapToObj(Integer::toString)
            .collect(Collectors.joining(" "));
    }

    default int getMin() {
        return 0;
    }

    default String getTimes() {
        ExpressionType expressionType = CronExpressionRecognizer.recognizeCronExpression(value());
        return switch (expressionType) {
            case ALL: yield getAll();
            case RANGE: yield getRange();
            case VALUES: yield getValues();
            case INCREMENTS: yield getIncrements();
            default:
                throw new IllegalStateException("Unexpected value: " + value());
        };
    }

}
