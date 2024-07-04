package dev.rogacki.fields;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HourTest {

    @Test
    @DisplayName("Should return all single hours")
    void shouldReturnAllSingleHours() {
        // Given
        Hour hour = new Hour("*");

        // When
        String times = hour.getTimes();

        // Then
        String[] split = times.split(" ");
        assertEquals(24, split.length);
    }

    @Test
    @DisplayName("Should return incrementing hours")
    void shouldReturnIncrementingHours() {
        // Given
        Hour hour = new Hour("*/10");

        // When
        String times = hour.getTimes();

        // Then
        assertEquals("0 10 20", times);
    }

    @Test
    @DisplayName("Should return range")
    void shouldReturnRange() {
        // Given
        Hour hour = new Hour("10-13");

        // When
        String times = hour.getTimes();

        // Then
        assertEquals("10 11 12 13", times);
    }

    @Test
    @DisplayName("Should return specific values")
    void shouldReturnSpecificValues() {
        // Given
        Hour hour = new Hour("11,12,22");

        // When
        String times = hour.getTimes();

        // Then
        assertEquals("11 12 22", times);
    }

}
