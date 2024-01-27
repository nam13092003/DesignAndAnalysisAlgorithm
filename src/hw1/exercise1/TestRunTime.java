package hw1.exercise1;

import java.util.Arrays;
import java.util.Random;

public class TestRunTime {
    public static void main(String[] args) {
        Random random = new Random();
        Sort bubbleSort = new BubbleSort();
        Sort selectionSort = new SelectionSort();
        Sort insertionSort = new InsertionSort();
        Sort quickSort = new QuickSort();
        Sort mergeSort = new MergeSort();
        Sort heapSort = new HeapSort();

        int[] n = new int[]{10, 100, 1000, 10000,100000};
        for (int i = 0; i < n.length; i++) {
            int[] arr = new int[n[i]];
            for (int j = 0; j < n[i]; j++) {
                arr[j] = random.nextInt(1, 10000);
            }
            bubbleSort.setData(arr);
            bubbleSort.sort();
            System.out.println("bubbleSort's time of " + n[i] + " elements : " + bubbleSort.getTime());

            for (int j = 0; j < n[i]; j++) {
                arr[j] = random.nextInt(1, 10000);
            }
            selectionSort.setData(arr);
            selectionSort.sort();
            System.out.println("selectionSort's time of " + n[i] + " elements : " + selectionSort.getTime());

            for (int j = 0; j < n[i]; j++) {
                arr[j] = random.nextInt(1, 10000);
            }
            insertionSort.setData(arr);
            insertionSort.sort();
            System.out.println("insertionSort's time of " + n[i] + " elements : " + insertionSort.getTime());

            for (int j = 0; j < n[i]; j++) {
                arr[j] = random.nextInt(1, 10000);
            }
            quickSort.setData(arr);
            quickSort.sort();
            System.out.println("quickSort's time of " + n[i] + " elements : " + quickSort.getTime());

            for (int j = 0; j < n[i]; j++) {
                arr[j] = random.nextInt(1, 10000);
            }
            mergeSort.setData(arr);
            mergeSort.sort();
            System.out.println("mergeSort's time of " + n[i] + " elements : " + mergeSort.getTime());

            for (int j = 0; j < n[i]; j++) {
                arr[j] = random.nextInt(1, 10000);
            }
            heapSort.setData(arr);
            heapSort.sort();
            System.out.println("heapSort's time of " + n[i] + " elements : " + heapSort.getTime());
        }
    }
}
