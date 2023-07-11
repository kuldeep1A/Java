package src;
import java.util.*;

public class InterSectionOf2Array {
    public static Set<Integer> set = new HashSet<>();
    public static List<Integer> list = new ArrayList<>();
    public static void createSet(int[] arr){
        for (int num: arr){
            set.add(num);
        }
    }
    public static void createList(int[] arr){
        for (int num: arr){
            if (set.contains(num)){
                list.add(num);
                set.remove(num);
            }
        }
    }
    public static void InterSection(int[] arr1, int[] arr2){
        if (arr1.length <= arr2.length){
            createSet(arr1);
            createList(arr2);
        } else {
            createSet(arr2);
            createList(arr1);
        }
        System.out.println(list);
        int[] ew = new int[2];
        System.out.println(ew.getClass().getSimpleName());
        System.out.println(list.getClass().getSimpleName());
    }
    public static void main(String[] args) {
        int[] arr1 = { 7, 3, 9, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };
        InterSection(arr1, arr2);
    }
}
