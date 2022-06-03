import java.util.*;
import java.util.stream.Collectors;

public class SimpleProblems {
    public static void main(String[] args) {

        //Find Duplicates
        Integer[] list1 = {5, 13, 4, 21, 13, 27, 2, 59, 59, 34};
        HashSet<Integer> hash = new HashSet<>();
        List<Integer> duplicates = Arrays.stream(list1)
                .filter(x -> !hash.add(x))
                .toList();
        System.out.println(duplicates);

        //Remove Duplicates
        Integer[] list2 = {4,5,7,8,99,100,101,33,32,4,4};
        List<Integer> removeDups = Arrays.stream(list2)
                .distinct().toList();
        System.out.println(removeDups);

        //find max
        Integer[] list3 = {3,90,350,5};
        Integer maxNum = Arrays.stream(list3)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println(maxNum);

        //find min and max
        Integer[] list4 = { 6, 8, 3, 5, 1, 9 };
        Integer min = Arrays.stream(list4)
                .min(Comparator.comparing(Integer::valueOf))
                .get();
        Integer max = Arrays.stream(list4)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("list4 Min = " + min + " list4 Max = " + max);


    }
}
