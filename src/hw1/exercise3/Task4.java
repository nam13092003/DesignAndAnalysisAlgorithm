package hw1.exercise3;

public class Task4 {
    public static int pred(int a) {
        if (a > 0) {
            System.out.println(a);
            return pred(a-1);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(pred(5));
    }
}
