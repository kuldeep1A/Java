import java.util.Arrays;

public class countElements {
    public static int countElements1(int[] nums){
        final int min = Arrays.stream(nums).min().getAsInt();
        final int max = Arrays.stream(nums).max().getAsInt();
        return (int) Arrays.stream(nums).filter(num -> min < num && num < max).count();
    }

    public static void main(String[] args) {
//        int[] nums = {11,7,2,15};
        int[] nums = {-3,3,3,90};
        System.out.println(countElements1(nums));
    }

}
