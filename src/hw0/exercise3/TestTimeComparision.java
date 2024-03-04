package hw0.exercise3;

import hw0.exercise1.MergeSort;
import hw0.exercise2.BinarySearchSortedArray;
import hw0.exercise2.LinearSearchArray;

import java.util.Random;

public class TestTimeComparision {
    public static double getTimeBinarySearch(int[] arr, int x) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.setData(arr);
        mergeSort.sort();
        double preTime = System.nanoTime();
        BinarySearchSortedArray.search(arr, 0, arr.length - 1, x);
        return System.nanoTime() - preTime;
    }

    public static double getTimeLinearSearch(int[] arr, int x) {
        double preTime = System.nanoTime();
        LinearSearchArray.search(arr, x);
        return System.nanoTime() - preTime;
    }

    public static double getTimeBinarySearchTree(int[] arr, int x) {
        Node root = new Node(arr[0]);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for (int i = 1; i < arr.length; i++) {
            binarySearchTree.insert(arr[i], root);
        }
        double preTime = System.nanoTime();
        binarySearchTree.search(x, root);
        return System.nanoTime() - preTime;
    }

    public static void main(String[] args) {

        Random random = new Random();
        int[] n = new int[]{1000, 10000, 100000,1000000};
        for (int i = 0; i < n.length; i++) {
            int[] arr = new int[n[i]];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = random.nextInt(0, 1000);
            }
            int x = arr[random.nextInt(0,n[i])];
            System.out.println("LinearSearch " + n[i] + " elements: " + getTimeLinearSearch(arr, x));
            System.out.println("BinarySearchTree " + n[i] + " elements: " + getTimeBinarySearchTree(arr, x));
            System.out.println("BinarySearch " + n[i] + " elements: " + getTimeBinarySearch(arr, x));
            System.out.println();
        }
    }
}
// ít phần tử thì cây nhị phân tìm kiếm là tốt nhất
// nhiều phần tử thì tìm kiếm nhị phân là tốt nhất
