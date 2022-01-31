import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,332,4,4,35,52,5,25,2,52,52,42,52,6536,15,15,52,52,3);

        System.out.println("Find Even Numbers :: ");
        list1.stream().filter(e->e%2==0).forEach(System.out::println);
        //output : 332 4 4 52 2 52 52 42 52 6536 52 52

        System.out.println("Find Odd Numbers ::");
        list1.stream().filter(e->e%2!=0).forEach(System.out::println);
        //output : 1 35 5 25 15 15 3

        System.out.println("Sum Even Numbers ::");
        int sum1=   list1.stream().filter(e->e%2==0).mapToInt(Integer::intValue).sum();
        System.out.println(sum1);
        //output : 7232

        System.out.println("Sum All Numbers ::");
       int sum2 = list1.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum2);
        //output : 7331

        System.out.println(" Sum Odd Numbers ::");
        int sum3 = list1.stream().filter(e->e%2 !=0).mapToInt(Integer::intValue).sum();
        System.out.println(sum3);
        //output : 99

        System.out.println("Getting first 3 Digits");
        list1.stream().limit(3).forEach(System.out::println);
        //output : 1, 332, 4


        System.out.println("Getting Last 3 Digits");
        list1.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
        //output : 6536, 332, 52

        System.out.println("Getting Duplicates");
        Set<Integer> set = new HashSet<>();
        list1.stream().filter(n-> !set.add(n)).distinct().forEach(System.out::println);
        //output : 4, 52, 15

        System.out.println(" Find Maximum Number");
        int max = list1.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);
        //output : 6536

        System.out.println("Find Minimum Number");
        int min = list1.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);
        //output : 1

        System.out.println("getting Sorting Order :: ");
        list1.stream().sorted().forEach(System.out::println);
        //output : 1 2 3 4 4 5 15 15 25 35 42 52 52 52 52 52 52 332 6536


        System.out.println("getting Reverse Sorting Order :: ");
        list1.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
        //output : 6536 332 52 52 52 52 52 52 42 35 25 15 15 5 4 4 3 2 1

        System.out.println("Add 10 to each number");
        list1.stream().map(x->x+10).forEach(System.out::print);
        //output :: 11 342 14 14 45 62 15 35 12 62 62 52 62 65 46 25 25 62 62 13

    }
}
