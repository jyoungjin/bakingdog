package 바킹독.재귀.problem;

import java.io.*;

/**
 * [실버 1] Z : https://www.acmicpc.net/problem/1074
 */
public class BOJ1074 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int r = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        bw.write(String.valueOf(recur(n, r, c)));
        bw.flush();
        bw.close();
        br.close();
    }

    private static long recur(int n, int r, int c) {
        // base condition
        if (n == 0) {
            return 0;
        }
        int half = 1 << n - 1;

        if (r < half && c < half) {
            // 1사분면
            return recur(n - 1, r, c);
        }
        if (r < half && c >= half) {
            // 2사분면
            return half * half + recur(n - 1, r, c - half);
        }
        if (r >= half && c < half) {
            // 3사분면
            return 2 * half * half + recur(n - 1, r - half, c);
        }
        // 4사분면
        return 3 * half * half + recur(n - 1, r - half, c - half);
    }
}
