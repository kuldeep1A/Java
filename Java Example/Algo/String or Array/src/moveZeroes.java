package src;

import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int i = 0;
        for (final int num :nums) {
            if (num != 0)
                nums[i++] = num;
        }
        while (i < nums.length){
            nums[i++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
