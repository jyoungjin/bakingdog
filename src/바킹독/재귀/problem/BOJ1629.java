package 바킹독.재귀.problem;

import java.io.*;

/**
 * [실버 1] 곱셈 : https://www.acmicpc.net/problem/1629
 */
public class BOJ1629 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        long a = Long.parseLong(s[0]);
        long b = Long.parseLong(s[1]);
        long c = Long.parseLong(s[2]);

        bw.write(String.valueOf(recursion(a, b, c)));

        bw.flush();
        bw.close();
        br.close();
    }

    private static long recursion(long a, long b, long c) {
        // base condition
        if (b == 1) {
            return a % c;
        }
        long val = recursion(a, b / 2, c);
        val = val * val % c;
        if (b % 2 == 0) {
            return val;
        }
        return val * a % c;
    }
}

