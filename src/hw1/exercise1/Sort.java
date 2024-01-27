package hw1.exercise1;

public interface Sort {
    void setData(int[] data);

    void sort();

    double getTime();

    int getCountComparisions();

    int getCountSwap();
    void setCanPrint();
    String getName();
}