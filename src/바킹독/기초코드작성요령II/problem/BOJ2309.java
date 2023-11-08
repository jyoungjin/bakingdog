package 바킹독.기초코드작성요령II.problem;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 일곱 난쟁이
 */
public class BOJ2309 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = IntStream.rangeClosed(0, 8).mapToObj(i -> sc.nextInt()).sorted().collect(Collectors.toCollection(ArrayList::new));
        int diff = list.stream().reduce(0, Integer::sum) - 100;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == diff) {
                    list.remove(list.get(j));
                    list.remove(list.get(i));
                    list.forEach(System.out::println);
                    return;
                }
            }
        }
    }
}
