package algoExpert.selectionSort;

import org.junit.jupiter.api.Test;

import static algoExpert.selectionSort.SelectionSort.selectionSort;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectionSortTest {
    @Test
    void shouldReturnEmptyArrayWhenGivenEmptyArray() {
        int[] arrayIn = new int[0];
        assertEquals(0, selectionSort(arrayIn).length);
    }
}
