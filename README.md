# CronParser

Welcome the CronParser assignment.

## Requirements

For build and runn the app you need:

- [OpenJDK 21](https://openjdk.org/projects/jdk/21/)

## Running the application locally

```shell
./gradlew run --args="<minute> <hour> <day-of-month> <month> <day-of-week> <command>"
```

## Sample command

```shell
./gradlew run --args="9/1 9-17 1,15 * 1-5 /usr/bin/find"        
```
