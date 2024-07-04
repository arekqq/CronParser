package dev.rogacki.fields;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MonthTest {

    @Test
    @DisplayName("Should return all single months")
    void shouldReturnAllSingleMonths() {
        // Given
        Month month = new Month("*");

        // When
        String times = month.getTimes();

        // Then
        String[] split = times.split(" ");
        assertEquals(12, split.length);
    }

    @Test
    @DisplayName("Should return incrementing months")
    void shouldReturnIncrementingmonths() {
        // Given
        Month month = new Month("*/4");

        // When
        String times = month.getTimes();

        // Then
        assertEquals("0 4 8 12", times);
    }

    @Test
    @DisplayName("Should return range")
    void shouldReturnRange() {
        // Given
        Month month = new Month("9-11");

        // When
        String times = month.getTimes();

        // Then
        assertEquals("9 10 11", times);
    }

    @Test
    @DisplayName("Should return specific values")
    void shouldReturnSpecificValues() {
        // Given
        Month month = new Month("1,2,12");

        // When
        String times = month.getTimes();

        // Then
        assertEquals("1 2 12", times);
    }

}
