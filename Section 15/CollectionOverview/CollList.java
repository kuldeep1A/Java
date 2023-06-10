import java.util.*;

public class CollList {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        String[] names = {"Anna", "Bob", "Carol", "David", "Edna"};
//        list.addAll(Arrays.asList(names));
        String[] names = {"Anna", "Bob", "Carol", "David", "Edna"};
        List<String> list = new ArrayList<>(Arrays.asList(names));
        list.add("naveenBro");
        list.addAll(Arrays.asList("George", "Gray", "Grace"));
        System.out.println(list);
        System.out.println("Harry is in the list " + list.contains("Harry"));

        list.removeIf(s -> s.charAt(0) == 'A');
        System.out.println(list); // Remove Anna because at index of string 0 is 'A'
        Collection<String> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(names));
        System.out.println(treeSet);
    }
}
