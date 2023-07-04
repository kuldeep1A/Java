package ArrReferences;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        // References of myIntArray4
        int[] anotherArray = myIntArray;
//        int[] anotherArray = myIntArray.clone();
        myIntArray[1] = 3;
        modifyArray(anotherArray);

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));
    }
    private static void modifyArray(int[] array){
        array[0] = 1;
    }
}
