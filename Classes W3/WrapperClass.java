public class WrapperClass {
//    ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
//    ArrayList<int> myNumbers = new ArrayList<Integer>(); // Valid
//    Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList,
//    where primitive types cannot be used (the list can only store objects):
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println("object: " +  myInt);
        System.out.println("object: " + myDouble);
        System.out.println("object: " + myChar);
        System.out.println("value: " + myInt.intValue());
        System.out.println("value: " + myDouble.doubleValue());
        System.out.println("value: " + myChar.charValue());
    }
}
