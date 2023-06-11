import org.jetbrains.annotations.NotNull;

public class AllAboutStrings {
    public static void main(String[] args) {
        printInformation("Hello Github");
        printInformation("");
        printInformation(" ");// space is blank

        String str = "Github is best for store code";
        // if character is not present then return -1
        System.out.printf("Index of 'j' = %d %n", str.indexOf('j'));
        System.out.printf("Index of 'G' = %d %n", str.indexOf('G'));
        System.out.printf("Index of 'f' = %d %n", str.indexOf('f',8));
        System.out.printf("Index of 'o' = %d %n", str.lastIndexOf('o'));

        String helloWorldLower = str.toLowerCase();
        if (str.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (str.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }

        if (str.startsWith("Github")){
            System.out.println("String starts with 'Github'");
        }
        if (str.endsWith("code")) {
            System.out.println("String ends with 'code'");
        }
        if (str.contains("Github")) {
            System.out.println("String contains 'Github'");
        }

        if (str.contentEquals("Github is best for store code")) {
            System.out.println("Values match exactly");
        }
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        if (string.isEmpty()){
            System.out.println("String is Empty");
            return;
        }
        if (string.isBlank()){
            System.out.println("String is Blank");
            return;
        }
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
