package dev;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}
public class Main {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apple", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 2);
        System.out.println(Arrays.toString(groceryArray));
        System.out.println("-".repeat(20));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Banana"));
        objectList.add("Mango");
        System.out.println(objectList);
        System.out.println("-".repeat(20));

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Oranges", "PRODUCE", 5));

        // does not remove the first index to increase the growth of arrayList
        groceryList.add(0, new GroceryItem("Apple", "PRODUCE", 12));
        System.out.println(groceryList);

        System.out.println("-".repeat(20));

        // when we use set methode instead of add to remove the index and declare new value of that index
        groceryList.set(0, new GroceryItem("Banana", "PRODUCE", 120));
        System.out.println(groceryList);

        // remove the third item in the list
        System.out.println("remove-".repeat(5));
        groceryList.remove(2);
        System.out.println(groceryList);
    }
}
