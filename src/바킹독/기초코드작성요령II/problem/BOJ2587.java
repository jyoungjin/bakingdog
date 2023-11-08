package 바킹독.기초코드작성요령II.problem;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 대표값 2
 */
public class BOJ2587 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays.stream(new int[5]).map(i -> sc.nextInt()).sorted().toArray();
        System.out.println(Arrays.stream(array).reduce(0, Integer::sum) / 5 + "\n" + array[2]);
    }
}
