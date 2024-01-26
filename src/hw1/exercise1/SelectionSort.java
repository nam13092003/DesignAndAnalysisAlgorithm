package hw1.exercise1;

public class SelectionSort implements Sort {
    int[] data;
    double time;
    int countSwap;
    int countComparision;

    public void swap(int i, int j) {
        countSwap++;
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public void selectionSort() {
        for (int i = data.length - 1; i >= 0; --i) {
            int maxIndex = i;
            for (int j = 0; j < i; j++) {
                countComparision++;
                if (data[maxIndex] < data[j]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                swap(i, maxIndex);
            }
        }
    }

    @Override
    public void sort() {
        double preTime = System.nanoTime();
        selectionSort();
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

    @Override
    public int getCountComparisions() {
        return countComparision;
    }

    @Override
    public int getCountSwap() {
        return countSwap;
    }
}
