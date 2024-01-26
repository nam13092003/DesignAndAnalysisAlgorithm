package hw1.exercise1;

import hw1.exercise1.minHeapPriorityQueue.MinHeap;

public class HeapSort implements Sort{
    int[] data;
    double time;
    @Override
    public void sort() {
        MinHeap minHeap = new MinHeap();
        double preTime = System.nanoTime();
        for (int i = 0; i < data.length; i++) {
            minHeap.insert(data[i]);
        }
        int[] arr = new int[data.length];
        for (int i = 0; i < minHeap.length(); i++) {
            arr[i] = minHeap.removeMin();
        }
        time = System.nanoTime() - preTime;
    }

    @Override
    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public double getTime() {
        return time;
    }
}
