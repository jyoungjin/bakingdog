package 바킹독.기초코드작성요령II.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 핸드폰 요금
 */
public class BOJ15552 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            List<String> collect = Arrays.stream(br.readLine().split(" ")).collect(Collectors.toList());
            System.out.println(Integer.parseInt(collect.get(0)) + Integer.parseInt(collect.get(1)));
        }
    }
}
