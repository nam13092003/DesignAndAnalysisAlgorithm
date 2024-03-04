package hw1.exercise3;

public class Task1 {
    public static int multiplication(int a, int b) {
        if (b == 0 || a == 0) return 0;
        if (b == 1) {
            return a;
        }
        return a + multiplication(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(multiplication(5, 3));
    }
}
