package dev.rogacki.strategies;

import java.util.regex.Pattern;

public class AnyStrategy implements CronExpressionStrategy {
    private static final Pattern PATTERN = Pattern.compile("^\\?$");

    @Override
    public boolean matches(String value) {
        return PATTERN.matcher(value).matches();
    }

    @Override
    public ExpressionType getType() {
        return ExpressionType.ANY;
    }

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }
}
