package dev.rogacki.strategies;

import java.util.regex.Pattern;

public interface CronExpressionStrategy {

    ExpressionType getType();
    Pattern getPattern();

    default boolean matches(String value) {
        return getPattern().matcher(value).matches();
    }

}
