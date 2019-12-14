package algoExpert.binarySearch;
/*
    Write a function that takes in a sorted array of integers as well as a target integer.
    The function should use the Binary Search algorithm to find if the target number is
    contained in the array and should return its index if it is, otherwise -1;
 */
public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int lowPointer = 0;
        int middlePointer = 0;
        int highPointer = array.length - 1;

        while(lowPointer <= highPointer) {
            middlePointer = (lowPointer + highPointer) / 2;
            if(array[middlePointer] == target) {
                return middlePointer;
            } else if(array[middlePointer] > target) {
                highPointer = middlePointer - 1;
            } else {
                lowPointer = middlePointer + 1;
            }
        }

        return -1;
    }
}
