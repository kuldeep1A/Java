package dev;
import java.util.ArrayList;
import java.util.List;
public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples", "banana", "milk", "eggs"};
        // ImmutableCollection
        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println("-".repeat(20));

        //  System.out.println(list.getClass().getName());
        // list.add("yogurt");
        // mutableCollection
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);
        System.out.println(groceries.getClass().getName());
        System.out.println("-".repeat(20));

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);
        System.out.println("-".repeat(20));

        groceries.addAll(nextList);
        System.out.println(groceries);
    }
}
