package hw0.exercise2;

import hw0.exercise1.MergeSort;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchSortedArray {
    public static boolean search(int[] arr,int low,int high,int x){
        if (low<=high){
            int mid = low+(high-low)/2;
            if (arr[mid]>x){
                return search(arr,low,mid-1,x);
            } else if (arr[mid] <x) {
                return  search(arr,mid+1,high,x);
            }else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0,20);
        }
        MergeSort mergeSort = new MergeSort();
        mergeSort.setData(arr);
        mergeSort.sort();
        System.out.println(Arrays.toString(arr));
        System.out.println(search(arr,0,9,10));
    }
}
