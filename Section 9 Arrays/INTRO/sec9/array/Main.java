package sec9.array;

import java.util.Arrays;
import java.util.Objects;

public class Main{
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
//        Generate the error
//        myIntArray[0] = 46.0;
//        myIntArray[1] = "1";
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;
        System.out.println(myIntArray[5]);

        // The array initializer
        int[] firstFivePositives = new int[]{1, 2, 3, 4, 5};
        System.out.println(firstFivePositives[3]);


        double[] myDobuleArray = new double[10];
        myDobuleArray[2] = 3.5;
        System.out.println(myDobuleArray[2]);

        String[] names = {"Andy", "Bob", "Charlie", "David", "Eve"};
        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("First: " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Length of array = " + arrayLength);
        System.out.println("Last  = " + firstTen[arrayLength - 1]);

        int[] newArray;
        // Array initialization and default element values are 0
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
            System.out.print(newArray[i] + " ");
        }
        // Using Enhanced for loop, the for each loop
        // for (declaration: collection){
        //  ``````// block of statements
        // }
        System.out.println();
        for(int element: newArray){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if (objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array");
        }
        Object[] objectArray = new Object[4];
        objectArray[0] = "Hello";
        objectArray[1] = 2;
        objectArray[2] = 0.3;
        objectArray[3] = new StringBuilder("Word");


        for(Object d : objectArray){
            if (d instanceof StringBuilder){
                System.out.println("In this index of array have a String Builder like: " + d);
            } else{
                System.out.println("In this index of array  does not have string object");
            }
        }

    }
}
