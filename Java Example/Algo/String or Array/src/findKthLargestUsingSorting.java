package src;

import java.util.Arrays;

public class findKthLargestUsingSorting {
    public static int findKthLargest(int[] nums, int k){
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;

            high--;
            low++;
        }
        return nums[k - 1];
    }
    public static void main(String[] args) {
        int[] num1 = {3,2,1,5,6,4};
        int k1 = 2;
        System.out.println("first " + findKthLargest(num1, k1));
        int[] num2 = {3,2,3,1,2,4,5,5,6};
        int k2 = 4;
        System.out.println("second " + findKthLargest(num2, k2));
    }
}
