import java.util.Arrays;
import java.util.Scanner;

public class sortArrayD {
    public static void main(String[] args) {
        int[] numbers = getIntegers();
        int[] sortNumbers = sortIntegers(numbers);
        printArray(sortNumbers);
    }

    public static int[] getIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.print("Enter " + size + " integers: ");

        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array){
        System.out.println("Array contains:");
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] sortArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortArray);
        reverseArray(sortArray);
        return sortArray;
    }
    private static void reverseArray(int[] array){
        int low = 0;
        int high = array.length - 1;
        while (low < high){
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;

            low++;
            high--;
        }
    }
}
