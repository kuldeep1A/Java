package src;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class merge {
    public static int[][] _merge(int[][] intervals){
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int[] interval: intervals){
            if (ans.isEmpty() || (ans.get(ans.size() - 1)[1] < interval[0])){
                ans.add(interval);
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], interval[1]);
            }
        }
        return ans.toArray(int[][] ::new);
    }
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] res = _merge(intervals);
        for (int[] e: res){
            System.out.print("->");
            for (int i: e){
                System.out.print(i + " ");
            }
        }
    }
}
