package algoExpert.findThreeLargestNumbers;

import org.junit.jupiter.api.Test;

import static algoExpert.findThreeLargestNumbers.FindThreeLargestNumbers.findThreeLargestNumbers;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindThreeLargestNumbersTest {

    @Test
    void shouldReturnAnArrayOfMinValueIntegers() {
        int[] arrayIn = new int[0];
        assertEquals(Integer.MIN_VALUE, findThreeLargestNumbers(arrayIn)[0]);
        assertEquals(Integer.MIN_VALUE, findThreeLargestNumbers(arrayIn)[0]);
        assertEquals(Integer.MIN_VALUE, findThreeLargestNumbers(arrayIn)[0]);
    }

    @Test
    void shouldReturnOneWhenGivenArrayOfOne() {
        int [] arrayIn = new int[] {1};
        assertEquals(1, findThreeLargestNumbers(arrayIn)[2]);
    }

    @Test
    void shouldReturnTwoNumbersAsLargestWhenGivenTwoNumbers() {
        int [] arrayIn = new int[] {1, 2};
        assertEquals(1, findThreeLargestNumbers(arrayIn)[1]);
        assertEquals(2, findThreeLargestNumbers(arrayIn)[2]);
    }

    @Test
    void shouldReturnThreeNumbersAsLargestWhenGiveThreeNumbers() {
        int [] arrayIn = new int[] {1, 2, 3};
        assertEquals(3, findThreeLargestNumbers(arrayIn)[2]);
        assertEquals(2, findThreeLargestNumbers(arrayIn)[1]);
        assertEquals(1, findThreeLargestNumbers(arrayIn)[0]);
    }

    @Test
    void shouldReturnThreeLargestNumbers() {
        int [] arrayIn = new int[] {1, 2, 3, 7, 8, 20, 50, 100};
        assertEquals(100, findThreeLargestNumbers(arrayIn)[2]);
        assertEquals(50, findThreeLargestNumbers(arrayIn)[1]);
        assertEquals(20, findThreeLargestNumbers(arrayIn)[0]);
    }
}
