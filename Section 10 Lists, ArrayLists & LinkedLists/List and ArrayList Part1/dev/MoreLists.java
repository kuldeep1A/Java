package dev;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

        System.out.println("operation " + "-".repeat(15));

        System.out.println("Third item: " + groceries.get(2));

        if (groceries.contains("mustard")){
            System.out.println("List contains mustard");
        }

        groceries.add("yogurt");
        System.out.println(groceries);
        System.out.println("first: " + groceries.indexOf("yogurt"));
        System.out.println("second: " + groceries.lastIndexOf("yogurt"));

        groceries.remove(1);
        groceries.remove("apples");
        groceries.removeAll(List.of("yogurt", "cheese"));
        System.out.println(groceries);

        groceries.retainAll(List.of("eggs", "pickles", "mustard"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("IsEmpty: " + groceries.isEmpty());

        groceries.addAll(List.of("apple", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[0]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
