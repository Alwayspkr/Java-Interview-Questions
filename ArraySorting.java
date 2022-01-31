import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {

        int[] intarray = new int[]{1, 2, 42, 34, 2, 4, 34, 24, 56, 12, 5, 12, 56, 12, 542, 5, 12, 5623, 56};
        Arrays.stream(intarray).sorted().forEach(System.out::println);
       }
}