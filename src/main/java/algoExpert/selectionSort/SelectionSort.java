package algoExpert.selectionSort;

public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        if(array.length == 1){
            return array;
        }

        int indexOfLowestValue = 0;
        boolean foundLower = false;

        for(int lowPointer = 0; lowPointer < array.length - 1; lowPointer++) {

            indexOfLowestValue = lowPointer;
            foundLower = false;

            for(int highPointer = lowPointer + 1; highPointer < array.length; highPointer++) {
                if(array[highPointer] < array[indexOfLowestValue]) {
                    indexOfLowestValue = highPointer;
                    foundLower = true;
                }
            }

            if(foundLower) {
                swap(lowPointer, indexOfLowestValue, array);
            }
        }

        return array;
    }

    public static void swap(int lowPointer, int indexOfLowestValue, int[] array) {
        int temp = array[indexOfLowestValue];
        array[indexOfLowestValue] = array[lowPointer];
        array[lowPointer] = temp;
    }
}
