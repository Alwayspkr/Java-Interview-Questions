import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<String> list2 = new ArrayList<>(Arrays.asList("Pavan", "Kumar", "Ajay", "Tinku", "Suresh", "SriRam"));

        System.out.println("Sorting Order :: ");
        list2.stream().sorted().forEach(System.out::println);
        //output :Ajay Kumar Pavan SriRam Suresh Tinku

        System.out.println("Sorting Reverse Order:: ");
        list2.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        //output :Tinku Suresh SriRam Pavan Kumar Ajay

        System.out.println("getting first name ");
        list2.stream().limit(1).forEach(System.out::println);
        //output:: Pavan

        System.out.println("getting first 3 names ");
        list2.stream().limit(3).forEach(System.out::println);
        //output ::Pavan, Kumar Ajay

        System.out.println("Getting last 3 names");
        list2.stream().sorted(Comparator.reverseOrder()).limit(2).forEach(System.out::println);
        //output :: Tinku Suresh

        System.out.println("remove one element");
        list2.removeAll(Collections.singletonList("Pavan"));
        System.out.println(list2);
        //output :: Kumar, Ajay, Tinku, Suresh, SriRam

    }
}
