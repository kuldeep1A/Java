package src;
import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static int[] _twoSum(int[] nums, int target){
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++){
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 17;

        int[] res = _twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
