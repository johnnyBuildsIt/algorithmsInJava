package algoExpert.bubbleSort;

import org.junit.jupiter.api.Test;

import static algoExpert.bubbleSort.BubbleSort.bubbleSort;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BubbleSortTest {

    @Test
    void shouldReturnEmptyArrayWhenGivenEmptyArray() {
        int[] arrayIn = new int[0];
        assertTrue(bubbleSort(arrayIn).length == 0);
    }

    @Test
    void shouldReturnSortedArray() {
        int[] arrayIn = new int[] {3, 2, 8, 1, 0, -2};
        assertEquals(bubbleSort(arrayIn)[0], -2);
        assertEquals(bubbleSort(arrayIn)[1], 0);
        assertEquals(bubbleSort(arrayIn)[2], 1);
        assertEquals(bubbleSort(arrayIn)[3], 2);
        assertEquals(bubbleSort(arrayIn)[4], 3);
        assertEquals(bubbleSort(arrayIn)[5], 8);
    }
}
