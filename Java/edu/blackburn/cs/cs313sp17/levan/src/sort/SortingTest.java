/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.edu.blackburn.cs.cs313sp17.levan.src.sort;

import java.util.Random;

/**
 *
 * @author arthur.levan
 */
public class SortingTest {

    public static void main(String[] args) {
        int arraySize = 10;
        long time;
        long start;
        long end;
        int[] arrayTest = new int[arraySize];
        int[] arrayCopy;

        Random randomGenerator = new Random();

        //Array size 10
        System.out.println("Array Size of 10:");
        System.out.println("");
        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = randomGenerator.nextInt(arraySize);
        }
        arrayCopy = arrayTest.clone();
        Sort s = new Sort();
        start = System.currentTimeMillis();
        s.selectionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Selection Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.insertionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Insertion Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.shellSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Shell Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.mergeSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Merge Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.quickSort(arrayCopy, 0, arraySize - 1);
        end = System.currentTimeMillis();
        System.out.println("Quick Sort");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");

        //Array size 100
        arrayTest = new int[100];
        System.out.println("");
        System.out.println("Array Size of 100:");
        System.out.println("");
        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = randomGenerator.nextInt(arraySize);
        }
        arrayCopy = arrayTest.clone();
        s = new Sort();
        start = System.currentTimeMillis();
        s.selectionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Selection Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.insertionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Insertion Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.shellSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Shell Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.mergeSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Merge Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.quickSort(arrayCopy, 0, arraySize - 1);
        end = System.currentTimeMillis();
        System.out.println("Quick Sort");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");

        //Array size 1000
        arrayTest = new int[1000];
        System.out.println("");
        System.out.println("Array Size of 1000:");
        System.out.println("");
        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = randomGenerator.nextInt(arraySize);
        }
        arrayCopy = arrayTest.clone();
        s = new Sort();
        start = System.currentTimeMillis();
        s.selectionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Selection Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.insertionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Insertion Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.shellSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Shell Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.mergeSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Merge Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.quickSort(arrayCopy, 0, arraySize - 1);
        end = System.currentTimeMillis();
        System.out.println("Quick Sort");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        //Array size 10000
        arrayTest = new int[10000];
        System.out.println("");
        System.out.println("Array Size of 10000:");
        System.out.println("");
        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = randomGenerator.nextInt(arraySize);
        }
        arrayCopy = arrayTest.clone();
        s = new Sort();
        start = System.currentTimeMillis();
        s.selectionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Selection Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.insertionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Insertion Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.shellSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Shell Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.mergeSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Merge Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.quickSort(arrayCopy, 0, arraySize - 1);
        end = System.currentTimeMillis();
        System.out.println("Quick Sort");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        //Array size 100000
        arrayTest = new int[100000];
        System.out.println("");
        System.out.println("Array Size of 100000:");
        System.out.println("");
        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = randomGenerator.nextInt(arraySize);
        }
        arrayCopy = arrayTest.clone();
        s = new Sort();
        start = System.currentTimeMillis();
        s.selectionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Selection Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.insertionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Insertion Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.shellSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Shell Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.mergeSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Merge Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.quickSort(arrayCopy, 0, arraySize - 1);
        end = System.currentTimeMillis();
        System.out.println("Quick Sort");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        //Array size 125000
        arrayTest = new int[125000];
        System.out.println("");
        System.out.println("Array Size of 125000:");
        System.out.println("");
        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = randomGenerator.nextInt(arraySize);
        }
        arrayCopy = arrayTest.clone();
        s = new Sort();
        start = System.currentTimeMillis();
        s.selectionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Selection Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.insertionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Insertion Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.shellSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Shell Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.mergeSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Merge Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.quickSort(arrayCopy, 0, arraySize - 1);
        end = System.currentTimeMillis();
        System.out.println("Quick Sort");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        //Array size 250000
        arrayTest = new int[250000];
        System.out.println("");
        System.out.println("Array Size of 250000:");
        System.out.println("");
        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = randomGenerator.nextInt(arraySize);
        }
        arrayCopy = arrayTest.clone();
        s = new Sort();
        start = System.currentTimeMillis();
        s.selectionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Selection Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.insertionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Insertion Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.shellSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Shell Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.mergeSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Merge Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.quickSort(arrayCopy, 0, arraySize - 1);
        end = System.currentTimeMillis();
        System.out.println("Quick Sort");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        //Array size 500000
        arrayTest = new int[500000];
        System.out.println("");
        System.out.println("Array Size of 500000:");
        System.out.println("");
        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = randomGenerator.nextInt(arraySize);
        }
        arrayCopy = arrayTest.clone();
        s = new Sort();
        start = System.currentTimeMillis();
        s.selectionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Selection Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.insertionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Insertion Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.shellSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Shell Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.mergeSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Merge Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.quickSort(arrayCopy, 0, arraySize - 1);
        end = System.currentTimeMillis();
        System.out.println("Quick Sort");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        //Array size 625000
        arrayTest = new int[625000];
        System.out.println("");
        System.out.println("Array Size of 625000:");
        System.out.println("");
        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = randomGenerator.nextInt(arraySize);
        }
        arrayCopy = arrayTest.clone();
        s = new Sort();
        start = System.currentTimeMillis();
        s.selectionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Selection Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.insertionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Insertion Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.shellSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Shell Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.mergeSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Merge Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.quickSort(arrayCopy, 0, arraySize - 1);
        end = System.currentTimeMillis();
        System.out.println("Quick Sort");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        //Array size 1000000
        arrayTest = new int[1000000];
        System.out.println("");
        System.out.println("Array Size of 1000000:");
        System.out.println("");
        for (int i = 0; i < arrayTest.length; i++) {
            arrayTest[i] = randomGenerator.nextInt(arraySize);
        }
        arrayCopy = arrayTest.clone();
        s = new Sort();
        start = System.currentTimeMillis();
        s.selectionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Selection Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.insertionSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Insertion Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.shellSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Shell Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.mergeSort(arrayCopy);
        end = System.currentTimeMillis();
        System.out.println("Merge Sort:");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        System.out.println("");

        s.resetCounters();
        arrayCopy = arrayTest.clone();
        start = System.currentTimeMillis();
        s.quickSort(arrayCopy, 0, arraySize - 1);
        end = System.currentTimeMillis();
        System.out.println("Quick Sort");
        System.out.println("Comparisons: " + s.getComparisonCount());
        System.out.println("Swaps: " + s.getSwapCount());
        time = end - start;
        System.out.println("Total run time: " + time + "ms");
        // testing code goes here
        // note:  don't forget to make a copy of the original array for each
        //        sort test.  I recommend using arrayCopy = arrayTest.clone()
        // -DrewHans
    }//end main method
}
