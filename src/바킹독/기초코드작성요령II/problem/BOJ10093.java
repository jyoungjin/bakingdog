package 바킹독.기초코드작성요령II.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 숫자
 */
public class BOJ10093 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] array = str.split(" ");
        long a = Math.min(Long.parseLong(array[0]), Long.parseLong(array[1]));
        long b = Math.max(Long.parseLong(array[0]), Long.parseLong(array[1]));

        System.out.println(Math.max(b - a - 1, 0));
        StringBuilder sb = new StringBuilder();
        for (long i = a + 1; i <= b - 1; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
    }
}
