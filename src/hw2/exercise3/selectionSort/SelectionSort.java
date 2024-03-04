package hw2.exercise3.selectionSort;


public class SelectionSort {
    double time;

    public void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public void sort(int[] data) {
        double preTime = System.nanoTime();
        for (int i = data.length - 1; i >= 0; --i) {
            int maxIndex = i;
            for (int j = 0; j < i; j++) {
                if (data[maxIndex] < data[j]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                swap(data, i, maxIndex);
            }
        }
        time = System.nanoTime() - preTime;
    }

    public double getTime() {
        return time;
    }
}
