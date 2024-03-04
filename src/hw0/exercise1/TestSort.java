package hw0.exercise1;

import java.util.Arrays;
import java.util.Random;

public class TestSort {
    public static void main(String[] args) {
        Random random = new Random();
        Sort bubbleSort = new BubbleSort();
        Sort selectionSort = new SelectionSort();
        Sort insertionSort = new InsertionSort();
        Sort quickSort = new QuickSort();
        Sort mergeSort = new MergeSort();
        Sort heapSort = new HeapSort();

        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1,100000);
        }
        int[] arr1 = Arrays.copyOf(arr,arr.length);
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        int[] arr3 = Arrays.copyOf(arr,arr.length);
        int[] arr4 = Arrays.copyOf(arr,arr.length);
        int[] arr5 = Arrays.copyOf(arr,arr.length);
        int[] arr6 = Arrays.copyOf(arr,arr.length);

        Sortee sortee = new Sortee();

        sortee.setSortee(bubbleSort);
        sortee.sort(arr1);

        sortee.setSortee(selectionSort);
        sortee.sort(arr2);

        sortee.setSortee(insertionSort);
        sortee.sort(arr3);

        sortee.setSortee(quickSort);
        sortee.sort(arr4);

        sortee.setSortee(mergeSort);
        sortee.sort(arr5);

        sortee.setSortee(heapSort);
        sortee.sort(arr6);
    }
}
