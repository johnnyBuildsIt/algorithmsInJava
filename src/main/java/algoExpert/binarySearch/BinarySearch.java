package algoExpert.binarySearch;
/*
    Write a function that takes in a sorted array of integers as well as a target integer.
    The function should use the Binary Search algorithm to find if the target number is
    contained in the array and should return its index if it is, otherwise -1;
 */
public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int i = 0;
        int m = 0;
        int j = array.length - 1;

        while(i <= j) {
            m = (i + j) / 2;
            if(array[m] == target) {
                return m;
            } else if(array[m] > target) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }

        return -1;
    }
}
