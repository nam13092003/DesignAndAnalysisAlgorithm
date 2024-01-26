package hw1.exercise1.minHeapPriorityQueue;

public class MinHeap {
    private int[] data;
    int n;
    private int defaultSize = 12000;
    protected int countSwap;
    protected int countComparision;

    public MinHeap() {
        this.data = new int[defaultSize];
    }

    private void swap(int i, int j) {
        countSwap++;
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    protected void upHeap() {
        int i = n - 1;
        while (i > 0) {
            int p = parent(i);
            countComparision++;
            if (data[i] > data[p]) break;
            swap(i, p);
            i = p;
        }
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }


    private boolean hasLeft(int i) {
        return 2 * i + 1 < n;
    }

    private boolean hasRight(int i) {
        return 2 * i + 2 < n;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    protected void downHeap() {
        int i = 0;
        while (hasLeft(i)) {
            int lefIdx = left(i);
            int smallChildren = lefIdx;
            if (hasRight(i)) {
                int rightIdx = right(i);
                countComparision++;
                if (data[rightIdx] <= data[lefIdx]) {
                    smallChildren = rightIdx;
                }
            }
            countComparision++;
            if (data[smallChildren] >= data[i]) {
                break;
            }
            swap(i, smallChildren);
            i = smallChildren;
        }
    }

    public void insert(int element) {
        data[n++] = element;
        upHeap();
    }

    public int length() {
        return n;
    }

    public int removeMin() {
        if (n == 0) return Integer.MAX_VALUE;
        if (n == 1) {
            n--;
            return data[0];
        }
        int tmp = data[0];
        data[0] = data[n - 1];
        n--;
        downHeap();
        return tmp;
    }
}
