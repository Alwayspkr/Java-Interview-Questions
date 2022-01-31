import java.util.*;

public class CollectionsIteration {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Pavan","Kumar","Reddy");
        list.stream().forEach(System.out::println);

        Map<String, String> list2 = new HashMap<>();
        list2.put("one", "Pavan");
        list2.put("two", "Kumar");
        list2.put("three", "Reddy");
        list2.put("four", "Bharath");
        list2.put("five", "Naidu");

        list2.entrySet().stream().forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));

        Set<String> set = new HashSet<>();
        set.add("Pavan");
        set.add("Kumar");
        set.add("reddy");
        set.stream().forEach(System.out::println);

    }
}
