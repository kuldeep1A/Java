package multiple;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        System.out.println(Arrays.toString(array));
        for (int[] arr: array){
            System.out.println(Arrays.toString(arr));
        }
        for (int i = 0; i < array.length; i++){
            var innerArray = array[i];
            for (int j = 0; j < innerArray.length; j++){
//                System.out.print(array[i][j] + " ");
                array[i][j] = (i * 10) + (j + 1);
            }
//            System.out.println();
        }
        for (int[] outer: array){
            for (var element: outer){
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(array));

        array[1] = new int[] {10, 20, 30, 40, 50};
        System.out.println(Arrays.deepToString(array));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));
        anyArray[0] = new String[] {"a", "b", "c"};

    }
}
