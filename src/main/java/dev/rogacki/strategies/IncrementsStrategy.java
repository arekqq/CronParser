package dev.rogacki.strategies;

import java.util.regex.Pattern;

public class IncrementsStrategy implements CronExpressionStrategy {
    private static final Pattern PATTERN =  Pattern.compile(".+/.+");

    @Override
    public boolean matches(String value) {
        return PATTERN.matcher(value).matches();
    }

    @Override
    public ExpressionType getType() {
        return ExpressionType.INCREMENTS;
    }
}
