package dev.rogacki.fields;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinuteTest {

    @Test
    @DisplayName("Should return all single minutes")
    void shouldReturnAllSingleMinutes() {
        // Given
        Minute minute = new Minute("*");

        // When
        String times = minute.getTimes();

        // Then
        String[] split = times.split(" ");
        assertEquals(60, split.length);
    }

    @Test
    @DisplayName("Should return incrementing minutes")
    void shouldReturnIncrementingMinutes() {
        // Given
        Minute minute = new Minute("*/20");

        // When
        String times = minute.getTimes();

        // Then
        assertEquals("0 20 40", times);
    }

    @Test
    @DisplayName("Should return range")
    void shouldReturnRange() {
        // Given
        Minute minute = new Minute("18-20");

        // When
        String times = minute.getTimes();

        // Then
        assertEquals("18 19 20", times);
    }

    @Test
    @DisplayName("Should return specific values")
    void shouldReturnSpecificValues() {
        // Given
        Minute minute = new Minute("1,2,8");

        // When
        String times = minute.getTimes();

        // Then
        assertEquals("1 2 8", times);
    }

}
