package dev.rogacki.strategies;

public interface CronExpressionStrategy {
    boolean matches(String value);
    ExpressionType getType();
}
