package hw1.exercise1;

public class MergeSort implements Sort {
    int[] data;
    double time;

   public void merge(int[] data ,int left,int mid,int right){
       int n1 = mid -left+1;
       int n2 = right-mid;
       int[] Left = new int[n1];
       int[] Right = new int[n2];
       for (int i = 0; i < n1; i++) {
           Left[i] = data[i+left];
       }
       for (int i = 0; i < n2; i++) {
           Right[i] = data[mid+1+i];
       }
       int i=0,j=0;
       int k=0;
       while (i<n1 && j<n2){
           if (Left[i]<Right[j]){
               data[k] = Left[i];
               i++;
           }else {
               data[k] = Right[j];
               j++;
           }
           k++;
       }
       while (i<n1){
           data[k] = Left[i];
           i++;
           k++;
       }
       while (j<n2){
           data[k] = Right[j];
           j++;
           k++;
       }
   }
    public void mergeSort(int[] data,int left,int right){
       if (left<right){
           int mid = left+ (right-left)/2;
           mergeSort(data,left,mid);
           mergeSort(data,mid+1,right);
           merge(data,left,mid,right);
       }
    }
    @Override
    public void sort() {
        double preTime = System.nanoTime();
        mergeSort(data,0,data.length-1);
        time = System.nanoTime() - preTime;
    }
    @Override
    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public double getTime() {
        return 0;
    }
}
