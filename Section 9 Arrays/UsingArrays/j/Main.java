package j;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] firstArr = getRandomArray(9);
//        for(int i : res){
//            System.out.println(i);
//        }
        System.out.println(Arrays.toString(firstArr));
        Arrays.sort(firstArr);
        System.out.println(Arrays.toString(firstArr));

        int[] secondArr = new int[10];
        System.out.println(Arrays.toString(secondArr));
        Arrays.fill(secondArr, 12);
        System.out.println(Arrays.toString(secondArr));

        int[] thirdArr = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArr));

        int[] fourArr = Arrays.copyOf(thirdArr,thirdArr.length);
        System.out.println(Arrays.toString(fourArr));

        //small size of array
        int[] fiveArr = Arrays.copyOf(thirdArr, 3);
        System.out.println(Arrays.toString(fiveArr));

        String[] names = {"Charlie", "David", "Eve","Andy", "Bob"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        if (Arrays.binarySearch(names, "Eve") >= 0){
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};
        if (Arrays.equals(s1, s2)){
            System.out.println("Arrays are equals");
        } else{
            System.out.println("Arrays are not equal");
        }
    }
    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
