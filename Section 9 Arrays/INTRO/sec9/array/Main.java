package sec9.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<Integer> divideArrayIntoSubsets(int[] arr) {
        Arrays.sort(arr);
        reverseArray(arr);

        List<Integer> subsetA = new ArrayList<>();
        int sumA = 0;
        int sumB = 0;

        for (int num : arr) {
            if (sumA <= sumB) {
                subsetA.add(num);
                sumA += num;
            } else {
                sumB += num;
            }
        }

        return subsetA;
    }

    // Helper method to reverse the array in place
    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,7,5,6,2};
        List<Integer> subsetA = divideArrayIntoSubsets(arr);
        System.out.println("Subset A: " + subsetA);
    }
}
