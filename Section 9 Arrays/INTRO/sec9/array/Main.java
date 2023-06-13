package sec9.array;

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
        int[] firstFivePositives = new int[]{1,2,3,4,5};
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
        newArray = new int[] {5, 4, 3, 2, 1};
        for(int i: newArray){
            System.out.print(i + " ");
        }
    }
}
