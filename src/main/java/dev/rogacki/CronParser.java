package dev.rogacki;

public class CronParser {
    public static void main(String[] args) {
        if (args.length != 6) {
            System.out.println("Wrong number of arguments - cron expression should consist of: " +
                "<minute> <hour> <day-of-month> <month> <day-of-week> <command>");
        } else {
            CronExpression cronExpression = new CronExpression(args);
            cronExpression.printOutput();
        }
    }
}
