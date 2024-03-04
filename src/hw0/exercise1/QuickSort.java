package hw0.exercise1;

import java.util.Arrays;

public class QuickSort implements Sort {
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

    public int partition(int[] data, int low, int high) {
        int pivot = data[high]; // lấy high làm pivot
        int i = low - 1; // duyệt từ index -1
        for (int j = low; j < high; j++) {
            countComparision++;
            if (pivot > data[j]) {
                i++;
                swap(i, j); // xếp lại chỗ cho hai 2 phần được chia theo pivot
            }
            if (canPrint) {
                System.out.println(Arrays.toString(data));
            }
        }
        if (i + 1 != high) {
            swap(i + 1, high); // xếp lại vị trí cho pivot
            if (canPrint) {
                System.out.println(Arrays.toString(data));
            }
        }
        return i + 1;
    }

    @Override
    public void sort() {
        double preTime = System.nanoTime();
        quickSort(data, 0, data.length - 1);
        time = System.nanoTime() - preTime;
    }

    public void quickSort(int[] data, int low, int high) {
        if (low < high) {
            int pi = partition(data, low, high);
            quickSort(data, low, pi - 1);
            quickSort(data, pi + 1, high);
        }
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
        return "QuickSort";
    }
}
