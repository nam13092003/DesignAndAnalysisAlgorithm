package hw1.exercise1;

import java.util.Random;

public class Data {
    private int[] data;
    private Sort sort;
    private double time;

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

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public void sort() {
        sort.setData(data);
        sort.sort();
        time = sort.getTime();
    }


    public double[][] runtimeStatistics() {
        double[][] statistics = new double[110][2];
        int count = 0;
        int length = 10;
        for (int i = 0; i < statistics.length; i++) {
            double average = 0;
<<<<<<< HEAD
            for (int j = 0; j < 100; j++) {
=======
            for (int j = 0; j < 10; j++) {
>>>>>>> 2b3c2c3 (homeworkDSA)
                inputData(length);
                sort();
                average += sort.getTime();
            }
            statistics[count][0] = length;
<<<<<<< HEAD
            statistics[count][1] = average / 100;
=======
            statistics[count][1] = average / 10;
>>>>>>> 2b3c2c3 (homeworkDSA)
            count++;
            length += 100;
        }
        return statistics;
    }
}
