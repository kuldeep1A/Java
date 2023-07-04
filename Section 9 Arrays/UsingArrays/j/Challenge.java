package j;

import java.util.Arrays;
import java.util.Random;

public class Challenge {
    public static void main(String[] args) {
        int[] firstArr = getRandomArr(10);
        System.out.println(Arrays.toString(firstArr));
        Arrays.sort(firstArr);
        System.out.println(Arrays.toString(firstArr));
        int[] tempArr = Arrays.copyOf(firstArr, firstArr.length);
        // One Way with the help of sort function
        for(int i = 0; i < firstArr.length; i++){
            firstArr[i] = tempArr[firstArr.length - 1 - i];
        }
        System.out.println();
        System.out.println(Arrays.toString(firstArr));

        int[] secondArr = getRandomArr(11);
        int[] res = sortInteger(secondArr);
        System.out.println(Arrays.toString(res));


    }

    // Second way
    private static int[] sortInteger(int[] array){
        System.out.println(Arrays.toString(array));
        int[] sortedArr = Arrays.copyOf(array, array.length);
        int temp;
        boolean flag = true;
        while (flag){
            flag = false;
            for(int i = 0; i < sortedArr.length - 1; i++){
                if (sortedArr[i] < sortedArr[i + 1]){
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i + 1];
                    sortedArr[i + 1] = temp;
                    flag = true;
                    System.out.println("......>" + Arrays.toString(sortedArr));
                }
            }
            System.out.println("....>" + Arrays.toString(sortedArr));
        }
        return sortedArr;
    }
    private static int[] getRandomArr(int len){
        Random randomInt = new Random();
        int[] newInt = new int[len];
        for(int i = 0; i < len; i++){
            newInt[i] = randomInt.nextInt(1000);
        }

        return newInt;
    }
}
