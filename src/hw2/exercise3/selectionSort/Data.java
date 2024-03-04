package hw2.exercise3.selectionSort;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Data {
    private SelectionSort selectionSort = new SelectionSort();
    private int[] data;

    public Data() {
    }

    public Data inputData(int n) {
        Random rd = new Random();
        data = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            data[i] = rd.nextInt();
        }
        return this;
    }


    public void sort() {
        selectionSort.sort(data);
    }


    public Map<Integer,Double> runtimeStatistics() {
        Map<Integer,Double> statistics = new HashMap<>();
        int length =1;
        for (int i = 0; i < 100; i++) {
            double time =0;
            for (int j = 0; j < 100; j++) {
                inputData(length);
                sort();
                time+= selectionSort.getTime();
            }
            statistics.put(length,time/100);
            length += 100;
        }
        return statistics;
    }
}
