package src;

import java.util.Queue;
import java.util.PriorityQueue;

public class findKthLargest{
    public static int _findKthLargest(int[] nums, int k){
        Queue<Integer> minHeap = new PriorityQueue<>();
        for (int num: nums){
            minHeap.offer(num);
            if (minHeap.size() > k){
                minHeap.poll();
            }
        }
        assert minHeap.peek() != null;
        return minHeap.peek();
    }
    public static void main(String[] args) {
        int[] num1 = {3,2,1,5,6,4};
        int k1 = 2;
        System.out.println("first " + _findKthLargest(num1, k1));
        int[] num2 = {3,2,3,1,2,4,5,5,6};
        int k2 = 4;
        System.out.println("second " + _findKthLargest(num2, k2));
    }
}