package algoExpert.insertionSort;

import org.junit.jupiter.api.Test;

import static algoExpert.insertionSort.InsertionSort.insertionSort;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertionSortTest {
    @Test
    void shouldReturnEmptyArrayWhenInputEmpty() {
        int[] arrayIn = new int[0];
        assertEquals(0, insertionSort(arrayIn).length);
    }

    @Test
    void shouldReturnArrayLenOneWhenGivenArrayLenOne() {
        int[] arrayIn = new int[] {4};
        assertEquals(4, insertionSort(arrayIn)[0]);
    }

    @Test
    void shouldReturnSortedArray() {
        int[] arrayIn = new int[] {8, 5, 2, 9, 5, 6, 3};
        int[] outArray = insertionSort(arrayIn);
        assertEquals(2, outArray[0]);
        assertEquals(3, outArray[1]);
        assertEquals(5, outArray[2]);
        assertEquals(5, outArray[3]);
        assertEquals(6, outArray[4]);
        assertEquals(8, outArray[5]);
        assertEquals(9, outArray[6]);
    }
}
