package hw1.exercise1;

import java.util.Arrays;

public class InsertionSort implements Sort {
    int[] data;
    double time;
    int countSwap;
    int countComparision;
    boolean canPrint = false;

    public void insertionSort() {
        for (int i = 1; i < data.length; i++) {
            int j;
            int next = data[i];
            countComparision++;
            for (j = i - 1; j >= 0 && data[j] > next; j--) {
                data[j + 1] = data[j];
                countSwap++;
                countComparision++;
                if (canPrint) {
                    System.out.println(Arrays.toString(data));
                }
            }
            data[j + 1] = next;
            if (canPrint) {
                System.out.println(Arrays.toString(data));
            }
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

    @Override
    public void setCanPrint() {
        canPrint = true;
    }

    public String getName() {
        return "InsertionSort";
    }
}
