package dev.rogacki.strategies;

import java.util.regex.Pattern;

public class ValuesStrategy implements CronExpressionStrategy {
    private static final Pattern PATTERN = Pattern.compile("\\b\\w+(,\\w+)*\\b");

    @Override
    public ExpressionType getType() {
        return ExpressionType.VALUES;
    }

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }
}
