package java8;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortHashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        hmap.put(8,5);
        hmap.put(6,3);
        hmap.put(7,2);

        List<Map.Entry<Integer, Integer>> hmap1 = hmap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
        System.out.println(hmap1);
        System.out.println(hmap);
    }
}
