package hw0.exercise1;

import java.util.Arrays;

public class BubbleSort implements Sort {
    int[] data;
    double time;
    int countSwap;
    int countComparision;
    boolean canPrint = false;

    public void swap(int i, int j) {
        countSwap++;
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public void bubbleSort() {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                countComparision++;
                if (data[j] > data[j + 1]) {
                    swap(j, j + 1);
                }
                if (canPrint){
                    System.out.println(Arrays.toString(data));
                }
            }
        }
    }

    @Override
    public void sort() {
        double preTime = System.nanoTime();
        bubbleSort();
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

    @Override
    public String getName() {
        return "BubbleSort";
    }
}
