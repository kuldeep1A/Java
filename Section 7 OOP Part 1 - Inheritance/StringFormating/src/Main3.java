package src;
public class Main3 {

    public static void main(String[] args) {
        // † = \u2022 or • = \u2022

        String bulletIt = "Print a Bulleted List:\n" +
                "\t† First Point\n" +
                "\t\t† Sub Point";

        System.out.println(bulletIt);
        String textBlock = """
                Print a Bulleted List:
                    • First Point
                        • Sub Point""";
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d%n", age);
//
        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Brith year = %d%n", age, yearOfBirth);
        System.out.printf("Your age is %.2f%n", (float) age);

        for(int i = 1; i <= 100000; i *=10){
            System.out.printf("Printing %6d %n", i);
        }
        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);
        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}