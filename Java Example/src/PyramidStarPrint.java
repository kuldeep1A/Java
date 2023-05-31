import java.util.Scanner;

public class PyramidStarPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(": ");
        int NumRow = scan.nextInt();
        for(int i = 1; i <= NumRow; i++){
            //Print space in each row
            for(int j = 1; j <= NumRow - i; j++){
                System.out.print(" ");
            }
            //Print star in each row
            for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
