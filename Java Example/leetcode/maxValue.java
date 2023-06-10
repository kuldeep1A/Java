import java.util.Arrays;

public class maxValue {
    public static int maxValue1(int n, int index, int maxSum){
        return n + index + maxSum;
    }
    public static void main(String[] args) {
        int n = 4;
        int index = 2;
        int maxSum = 6;
        System.out.println(maxValue1(n, index, maxSum));
    }
}
