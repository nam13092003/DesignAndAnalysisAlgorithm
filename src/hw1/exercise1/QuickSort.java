package hw1.exercise1;

public class QuickSort implements Sort {
    int[] data;
    double time;
    public void swap(int[] arr, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public int partition(int[] data, int low, int high) {
        int pivot = data[high]; // lấy high làm pivot
        int i = low - 1; // duyệt từ index -1
        for (int j = low; j < high; j++) {
            if (pivot > data[j]) {
                i++;
                swap(data, i, j); // xếp lại chỗ cho hai 2 phần được chia theo pivot
            }
        }
        swap(data, i + 1, high); // xếp lại vị trí cho pivot
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
}
