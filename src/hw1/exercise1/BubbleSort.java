package hw1.exercise1;

public class BubbleSort implements Sort{
    int[] data;
    double time;
    public void swap(int i,int j){
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
    public void bubbleSort(){
        for (int i = 0; i < data.length-1; i++) {
            for (int j = 1; j < data.length-i-1; j++) {
                if (data[j]>data[j+1]){
                    swap(j,j+1);
                }
            }
        }
    }
    @Override
    public void sort() {
        double preTime = System.nanoTime();
        bubbleSort();
        time = System.nanoTime() - preTime;
    }
    @Override
    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public double getTime() {
        return time;
    }
}
