public class enums {
//    An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
    enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
//    Enum is short for "enumerations", which means "specifically listed".
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        if (today == Day.MONDAY){
            System.out.println("It's the beginning of the week!");
        }

        switch (today){
            case MONDAY:
                System.out.println("today is monday");
                break;
            case TUESDAY:
                System.out.println("today is tuesday");
                break;
            case WEDNESDAY:
                System.out.println("today is wednesday");
                break;
            case THURSDAY:
                System.out.println("today is thursday");
                break;
            case FRIDAY:
                System.out.println("today is friday");
                break;
            case SATURDAY:
                System.out.println("today is saturday");
                break;
            case SUNDAY:
                System.out.println("today is sunday");
                break;
        }

        System.out.println("Days of the week:");
        for (Day day: Day.values()){
            System.out.println(day);
        }
    }
}
