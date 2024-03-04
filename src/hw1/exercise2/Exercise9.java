package hw1.exercise2;

import java.util.Arrays;
import java.util.Random;

public class Exercise9 {
    public static void merge(int[] data, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] Left = new int[n1];
        int[] Right = new int[n2];
        for (int i = 0; i < n1; i++) {
            Left[i] = data[i + left];
        }
        for (int i = 0; i < n2; i++) {
            Right[i] = data[mid + 1 + i];
        }
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (Left[i] < Right[j]) {
                data[k] = Left[i];
                i++;
            } else {
                data[k] = Right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            if (k != i)
                data[k] = Left[i];
            i++;
            k++;
        }
        while (j < n2) {
            if (k != j)
                data[k] = Right[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] data, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(data, left, mid);
            mergeSort(data, mid + 1, right);
            merge(data, left, mid, right);
        }
    }

    public static double MinDistance(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        if (arr.length == 1) return 0;
        int dMin = Math.abs(arr[0] - arr[1]);
        for (int i = 0; i < arr.length - 1; i++) {
            if (dMin > Math.abs(arr[i+1] - arr[i])) {
                dMin = Math.abs(arr[i+1] - arr[i]);
            }
        }
        return dMin;
    }
}
class Test{
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr= new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0,100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Exercise9.MinDistance(arr));
        System.out.println(Arrays.toString(arr));
    }
}
