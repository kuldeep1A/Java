package src;
import java.util.*;

public class SubarraySumEqualToK {
    public static void main(String[] args) {
        int[] arr = { 10, 2, -2, -20, 10 };
        int k = -10;
        HashMap<Integer, Integer> map = new HashMap<>(); // <Sum , Freq>
        map.put(0, 1); // empty subarray
        int ans = 0;
        int sum = 0;
        for (int i : arr) {
            sum += i;
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            if (map.containsKey(sum)) {
                //update frequency
                map.put(sum, map.get(sum) + 1);
            } else {
                // first frequency
                map.put(sum, 1);
            }
        }
        System.out.println(ans);
    }
}

