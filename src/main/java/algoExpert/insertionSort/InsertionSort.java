package algoExpert.insertionSort;

public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        if(array.length == 1){
            return array;
        }

        int lowPointer = 0;
        int highPointer = 1;
        int highPlaceSaver = 1;

        while(highPlaceSaver < array.length) {
            if(array[lowPointer] > array[highPointer]) {
                swap(lowPointer, highPointer, array);
                lowPointer--;
                highPointer--;

                while(lowPointer >= 0){
                    if(array[lowPointer] > array[highPointer]) {
                        swap(lowPointer, highPointer, array);
                    }

                    lowPointer--;
                    highPointer--;
                }
            }

            highPlaceSaver++;
            highPointer = highPlaceSaver;
            lowPointer = highPointer - 1;
        }

        return array;
    }

    public static void swap(int a, int b, int[] array) {
        int temp = 0;
        temp = array[b];
        array[b] = array[a];
        array[a] = temp;
    }
}
