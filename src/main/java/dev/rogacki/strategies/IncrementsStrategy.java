package dev.rogacki.strategies;

import java.util.regex.Pattern;

public class IncrementsStrategy implements CronExpressionStrategy {
    private static final Pattern PATTERN =  Pattern.compile(".+/.+");

    @Override
    public ExpressionType getType() {
        return ExpressionType.INCREMENTS;
    }

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }
}
