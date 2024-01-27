package hw1.exercise1;

import hw1.exercise1.minHeapPriorityQueue.MinHeap;

import java.util.Arrays;

public class HeapSort implements Sort {
    MinHeap minHeap = new MinHeap();
    double time;
    boolean canPrint = false;

    @Override
    public void sort() {
        double preTime = System.nanoTime();
        for (int i = 0; i < minHeap.getData().length; i++) {
            minHeap.insert(minHeap.getData()[i]);
        }
        int[] arr = Arrays.copyOf(minHeap.getData(), minHeap.getData().length);
        if (canPrint) {
            System.out.println(Arrays.toString(arr));
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = minHeap.removeMin();
            if (canPrint) {
                System.out.println(Arrays.toString(arr));
            }
        }
        time = System.nanoTime() - preTime;
    }

    @Override
    public void setData(int[] data) {
        minHeap.setData(data);
    }

    @Override
    public double getTime() {
        return time;
    }

    @Override
    public int getCountComparisions() {
        return minHeap.getCountSwap();
    }

    @Override
    public int getCountSwap() {
        return minHeap.getCountSwap();
    }

    @Override
    public void setCanPrint() {
        canPrint = true;
    }

    public String getName() {
        return "HeapSort";
    }
}
