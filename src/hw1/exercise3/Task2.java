package hw1.exercise3;

public class Task2 {
    public static int exponentiation(int a,int b){
        if (b==1){
            return a;
        }
        return a* exponentiation(a,b-1);
    }

    public static void main(String[] args) {
        System.out.println(exponentiation(2,3));
    }
}
