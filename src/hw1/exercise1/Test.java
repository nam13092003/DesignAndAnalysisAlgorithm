package hw1.exercise1;

import hw1.exercise1.minHeapPriorityQueue.MinHeap;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        MinHeap minHeap = new MinHeap();
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =random.nextInt(0,100);
            minHeap.insert(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = minHeap.removeMin();
        }
        System.out.println(Arrays.toString(arr));
    }
}
