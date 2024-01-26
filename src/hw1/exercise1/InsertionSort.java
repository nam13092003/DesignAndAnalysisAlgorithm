package hw1.exercise1;

public class InsertionSort implements Sort {
    int[] data;
    double time;
    int countSwap;
    int countComparision;

    public void insertionSort() {
        for (int i = 1; i < data.length; i++) {
            int j;
            int next = data[i];
            countComparision++;
            for (j = i - 1; j >= 0 && data[j] > next; j--) {
                data[j + 1] = data[j];
                countSwap++;
                countComparision++;
            }
            data[j + 1] = next;
        }
    }

    @Override
    public void sort() {
        double preTime = System.nanoTime();
        insertionSort();
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
