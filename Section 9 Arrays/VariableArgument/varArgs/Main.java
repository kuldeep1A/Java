package varArgs;

public class Main {
    public static void main(String... args){
        String[] splitString = "Hello world again".split(" ");
        printText(splitString);

        System.out.println("-".repeat(20));
        printText("Jello");

        System.out.println("-".repeat(20));
        printText("Jello", "world", "again");

        System.out.println("-".repeat(20));
        printText(args);

        String[] sArray = {"first", "second", "third", "four", "five"};
        System.out.println(String.join(", ", sArray));
    }

    private static void printText(String... textList){
        for(String text: textList){
            System.out.print(text + ", ");
        }
        System.out.println();
    }
}
