import java.util.Arrays;

public class MinHeap {
    static private int capacity = 10;
    static private int size = 0;

    static int[]  items = new int[capacity];

    private static int getLeftChildIndex(int parentIndex){
        return 2 * parentIndex + 1;
    }
    private static int getRightChildIndex(int parentIndex){
        return 2 * parentIndex + 2;
    }
    private static int getParentIndex(int childIndex){
        return (childIndex - 1)/2;
    }

    private static boolean hasLeftChild(int index){
        return getLeftChildIndex(index) < size;
    }

    private static boolean hasRightChild(int index){
        return getRightChildIndex(index) < size;
    }
    private static boolean hasParent(int index){
        return getParentIndex(index) >= 0;
    }

    private static int leftChild(int index) {
        return items[getLeftChildIndex(index)];
    }

    private static int rightChild(int index){
        return items[getRightChildIndex(index)];
    }

    private static int parent(int index){
        return items[getParentIndex(index)];
    }

    private static void swap(int indexOne, int indexTwo){
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    private static void ensureExtraCapacity() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }

    public static int peek() {
        if (size == 0) throw new IllegalStateException();
        return items[0];
    }

    public static int poll() {
        if (size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    public static void add(int item){
        ensureExtraCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    public static void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && parent(index) > items[index]){
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    public static void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index)){
                smallerChildIndex = getRightChildIndex(index);
            }

            if (items[index] < items[smallerChildIndex]){
                break;
            } else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }

    public static void main(String[] args) {
        add(15);
        add(20);
        add(17);
        add(10);
        add(25);
        int resp = poll();
        int res = peek();
        System.out.println(resp);
        System.out.println(res);
        System.out.println(size);
    }
}
