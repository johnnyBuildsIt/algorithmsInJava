package algoExpert.findThreeLargestNumbers;

public class FindThreeLargestNumbers {
    public static int[] findThreeLargestNumbers(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for(int num : array){
            if(num > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num;
            } else if(num > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if(num > thirdLargest) {
                thirdLargest = num;
            }
        }

        return new int[] {thirdLargest, secondLargest, largest};
    }
}
