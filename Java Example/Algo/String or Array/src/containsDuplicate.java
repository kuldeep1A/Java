package src;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public static boolean _containDuplicate(int[] nums){
        Set<Integer> hasDuplicate = new HashSet<>();
        for (int num: nums){
            if (hasDuplicate.contains(num)){
                return true;
            }
            hasDuplicate.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,6 ,7, 1};
        boolean res = _containDuplicate(nums);
        System.out.println(res);
    }
}
