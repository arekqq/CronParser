package dev.rogacki.strategies;

import java.util.regex.Pattern;

public class RangeStrategy implements CronExpressionStrategy {
    private static final Pattern PATTERN = Pattern.compile("\\b\\w+-\\w+\\b");

    @Override
    public ExpressionType getType() {
        return ExpressionType.RANGE;
    }

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }
}
