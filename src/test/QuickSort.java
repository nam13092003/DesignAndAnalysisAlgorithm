package test;

public class QuickSort {
    public void sort(int[] arr) {
        int n = arr.length;
        sort(arr, 0, n - 1);
    }

    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    /*
    Set the last element as the pivot
    Put smaller elements on the left side of pivot
    And greater elements on the right side of pivot
     */
    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1; // return right pos of pivot
    }

    private void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public void name() {
        System.out.println("Quick Sort");
    }
}
