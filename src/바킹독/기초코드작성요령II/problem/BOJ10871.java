package 바킹독.기초코드작성요령II.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.util.stream.Collectors.joining;

public class BOJ10871 {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(str1);

        int n = Integer.parseInt(st1.nextToken());
        int x = Integer.parseInt(st1.nextToken());

        int[] arr = Arrays.stream(str2.split(" ")).mapToInt(Integer::parseInt).toArray();

        String collect = Arrays.stream(arr)
                .filter(i -> i < x)
                .mapToObj(String::valueOf)
                .collect(joining(" "));

        System.out.println(collect);
    }

    public static void main(String[] args) throws IOException {
        BOJ10871 boj10871 = new BOJ10871();
        boj10871.solution();
    }
}
