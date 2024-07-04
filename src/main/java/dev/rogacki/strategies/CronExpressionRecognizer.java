package dev.rogacki.strategies;

import java.util.List;

public class CronExpressionRecognizer {

    private CronExpressionRecognizer() {
        throw new java.lang.UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static final List<CronExpressionStrategy> strategies = List.of(
        new AllStrategy(), new AnyStrategy(), new RangeStrategy(), new ValuesStrategy(), new IncrementsStrategy()
    );

    public static ExpressionType recognizeCronExpression(String value) {
        return strategies.stream()
            .filter(strategy -> strategy.matches(value))
            .findFirst()
            .map(CronExpressionStrategy::getType)
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value: " + value));
    }
}
