package com.kodilla.testing.collection;

import collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {
    private OddNumbersExterminator oddNumbersExterminator;

    @BeforeEach
    public void setUp() {
        oddNumbersExterminator = new OddNumbersExterminator();
        System.out.println("Starting test: " + oddNumbersExterminator.getClass().getSimpleName());
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Test finished.");
    }

    @DisplayName("Testing empty list")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        // Given
        List<Integer> emptyList = new ArrayList<>();

        // When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);

        // Then
        assertEquals(0, result.size());
    }

    @DisplayName("Testing normal list")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        // Given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // When
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);

        // Then
        assertEquals(Arrays.asList(2, 4, 6, 8, 10), result);
    }

    @Test
    public void testOddNumbersExterminatorNormalListTwo() {
        // Given
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // When
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);

        // Then
        assertEquals(Arrays.asList(2, 4, 6, 8, 10), result);
    }

}