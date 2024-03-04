package hw2.exercise3.bubbleSort;

public class BubbleSort {
    double time;

    private void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public void sort(int[] data) {
        double preTime = System.nanoTime();
        for (int i = 0; i < data.length-1; i++) {
            for (int j = 1; j < data.length - i - 1; j++) {
                if (data[j]<data[j+1]){
                    swap(data,j,j+1);
                }
            }
        }
        time = System.nanoTime() - preTime;
    }

    public double getTime() {
        return time;
    }
}
