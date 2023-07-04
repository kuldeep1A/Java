import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    private static int[] readIntegers(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas: ");
        String input = scan.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int FindMinimum(int[] numbers){
        int minimum = Integer.MAX_VALUE;
        for(int num: numbers){
            if (num < minimum){
                minimum = num;
            }
        }
        return minimum;
    }

    public static void main(String... args) {
        int[] numbers = readIntegers();
        int minimum = FindMinimum(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("minimum: " + minimum);
    }
}
