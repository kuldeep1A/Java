package src;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
// such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//
//Notice that the solution set must not contain duplicate triplets.
public class threeSum {
    public static List<List<Integer>> _threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++){
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            // Choose the nums[i] as first num in the triplet.
            // and search the remaining nums in [i + 1, n - 1]

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r){
                final int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0){
                    result.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
                    while (l < r && nums[l] == nums[l - 1])
                        l++;
                    while (r > l && nums[r] == nums[r - 1])
                        r--;
                } else if (sum < 0){
                    ++l;
                } else {
                    --r;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> res = _threeSum(nums);
        System.out.println(res);
    }
}
