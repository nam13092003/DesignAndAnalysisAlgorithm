package hw1.exercise3;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static int maximum(int[] arr,int n){
        if (n==0)return arr[0];
        return Math.max(maximum(arr,n-1),arr[n-1]);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0,100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(maximum(arr,arr.length));
    }
}
