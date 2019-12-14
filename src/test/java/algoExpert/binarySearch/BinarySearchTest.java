package algoExpert.binarySearch;

import org.junit.jupiter.api.Test;


import static algoExpert.binarySearch.BinarySearch.binarySearch;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinarySearchTest {

    @Test
    void shouldReturnNegativeOneForEmptyArray() {
        int[] searchList = new int[] {};
        assertTrue(binarySearch(searchList, 4) == -1);
    }

    @Test
    void shouldReturnZeroForSingleItemInArray() {
        int[] searchList = new int[] {4};
        assertTrue(binarySearch(searchList, 4) == 0);
    }

    @Test
    void shouldFindNumber() {
        int[] searchList = new int[] {0, 2, 3, 7, 10};
        assertTrue(binarySearch(searchList, 7) == 3);
    }
}
