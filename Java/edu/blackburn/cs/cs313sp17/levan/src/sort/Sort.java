package Java.edu.blackburn.cs.cs313sp17.levan.src.sort;

import java.util.Random;

public class Sort {

    private long swapCount;
    private long comparisonCount;

    public long getSwapCount() {
        return this.swapCount;
    }

    public long getComparisonCount() {
        return this.comparisonCount;
    }

    public void resetCounters() {
        this.swapCount = 0;
        this.comparisonCount = 0;
    }

    /**
     * selectionSort method
     * http://rosettacode.org/wiki/Sorting_algorithms/Selection_sort#Java
     *
     * @param input - unsorted array of integers
     */
    public void selectionSort(int[] input) {

        for (int currentPlace = 0; currentPlace < input.length - 1; currentPlace++) {
            comparisonCount++;
            int smallest = Integer.MAX_VALUE;
            int smallestAt = currentPlace + 1;
            for (int check = currentPlace; check < input.length; check++) {
                comparisonCount++;
                if (input[check] < smallest) {
                    comparisonCount++;
                    smallestAt = check;
                    smallest = input[check];
                    swapCount++;
                }
            }
            int temp = input[currentPlace];
            input[currentPlace] = input[smallestAt];
            input[smallestAt] = temp;
        }
    }// end selectionSort method

    /**
     * insertionSort method
     * http://rosettacode.org/wiki/Sorting_algorithms/Insertion_sort#Java
     *
     * @param input - unsorted array of integers
     */
    public void insertionSort(int[] input) {

        for (int i = 1; i < input.length; i++) {
            comparisonCount++;
            int value = input[i];
            int j = i - 1;
            while (j >= 0 && input[j] > value) {
                comparisonCount++;
                input[j + 1] = input[j];
                swapCount++;
                j = j - 1;
            }
            input[j + 1] = value;
            swapCount++;
        }
    }// end insertionSort method

    /**
     * shellSort method
     * http://rosettacode.org/wiki/Sorting_algorithms/Shell_sort#Java
     *
     * @param input - unsorted array of integers
     */
    public void shellSort(int[] input) {

        int increment = input.length / 2;
        while (increment > 0) {
            comparisonCount++;
            for (int i = increment; i < input.length; i++) {
                comparisonCount++;
                int j = i;
                int temp = input[i];
                while (j >= increment && input[j - increment] > temp) {
                    comparisonCount++;
                    input[j] = input[j - increment];
                    swapCount++;
                    j = j - increment;
                }
                input[j] = temp;
                swapCount++;
            }
            if (increment == 2) {
                increment = 1;
            } else {
                increment *= (5.0 / 11);
            }
        }
    }// end shellSort method

    /**
     * mergeSort method
     * https://www.buildingjavaprograms.com/code-files/4ed/ch13/MergeSort.java
     *
     * @param input - unsorted array of integers
     */
    public void mergeSort(int[] input) {

        if (input.length > 1) {
            // split array into two halves
            int leftSize = input.length / 2;
            int[] leftInput = new int[leftSize];
            for (int i = 0; i < leftSize; i++) {
                comparisonCount++;
                leftInput[i] = input[i];
                swapCount++;
            }

            int rightSize = input.length - leftSize;
            int[] rightInput = new int[rightSize];
            for (int i = 0; i < rightSize; i++) {
                comparisonCount++;
                rightInput[i] = input[i + leftSize];
                swapCount++;
            }

            // recursively sort the two halves
            mergeSort(leftInput);
            mergeSort(rightInput);

            // merge the sorted halves into a sorted whole
            merge(input, leftInput, rightInput);
        }
    }// end mergeSort method

    /**
     * merge method - merges the left and right arrays (overrides the original
     * input array that was passed into mergeSort)
     * https://www.buildingjavaprograms.com/code-files/4ed/ch13/MergeSort.java
     *
     * @param result - original mergeSort input array
     * @param left - sorted left half
     * @param right - sorted right half
     */
    public void merge(int[] result, int[] left, int[] right) {
        int i1 = 0;   // index into left array
        int i2 = 0;   // index into right array

        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                comparisonCount++;
                result[i] = left[i1];    // take from left
                swapCount++;
                i1++;
            } else {
                result[i] = right[i2];   // take from right
                swapCount++;
                i2++;
            }
        }
    }// end mergeSort method

    /**
     * quickSort method
     * http://www.programcreek.com/2012/11/quicksort-array-in-java/
     *
     * @param arr - unsorted array of integers
     * @param low - starting index
     * @param high - ending index
     */
    public void quickSort(int[] arr, int low, int high) {

        if (arr == null || arr.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make lefthalf < pivot and righthalf > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                comparisonCount++;
                swapCount++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j) {
            quickSort(arr, low, j);
        }

        if (high > i) {
            quickSort(arr, i, high);
        }
    }// end quickSort method

}// end Sort class
