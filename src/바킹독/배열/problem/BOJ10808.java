package 바킹독.배열.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 알파벳 개수
 * 문제: 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
 */
public class BOJ10808 {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();

        int[] arr = new int[26];
        char[] chars = str1.toCharArray();
        for (char c : chars) {
            arr[c - 97] += 1;
        }

        String collect = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(collect);
    }

    public static void main(String[] args) throws IOException {
        BOJ10808 boj10871 = new BOJ10808();
        boj10871.solution();
    }
}
