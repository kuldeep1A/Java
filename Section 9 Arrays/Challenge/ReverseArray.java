import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array){
        int j = array.length - 1;
        for (int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
        }
    }

    private static int[] reverseCopy(int[] array){
        int[] reverseArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int num: array){
            reverseArray[maxIndex--] = num;
        }
        return reverseArray;
    }

    public static void main(String[] args) {
        int[] array = {6, 5, 4, 3, 2, 1};
        reverse(array);
        System.out.println("reverse: " + Arrays.toString(array));
        int[] reverseArray = reverseCopy(array);
        System.out.println("again reverse: " + Arrays.toString(reverseArray));
    }
}
