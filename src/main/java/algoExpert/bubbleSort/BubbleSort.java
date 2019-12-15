package algoExpert.bubbleSort;

public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        if(array.length == 1) {
            return array;
        }

        boolean swapped = false;
        int i = 0;
        int j = 1;
        int temp = 0;

        while(true) {
            if(array[i] > array[j]) {
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                swapped = true;
            }

            i++;
            j++;

            if(j == array.length) {
                if(!swapped){
                    break;
                }

                i = 0;
                j = 1;
                swapped = false;
            }
        }

        return array;
    }
}
