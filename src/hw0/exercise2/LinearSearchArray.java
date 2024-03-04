package hw0.exercise2;

import java.util.Arrays;
import java.util.Random;

public class LinearSearchArray {
    public static boolean search(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
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
        System.out.println(Arrays.toString(arr));
        System.out.println(search(arr,10));
    }
}
