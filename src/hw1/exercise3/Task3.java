package hw1.exercise3;

public class Task3 {
    public static int factorial(int a){
        if (a==1){
            return 1;
        }
        return a* factorial(a-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
