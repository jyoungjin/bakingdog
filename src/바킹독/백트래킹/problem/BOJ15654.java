package 바킹독.백트래킹.problem;

import java.io.*;

/**
 * [실버 3] N과 M (5) : https://www.acmicpc.net/problem/15654
 */
public class BOJ15654 {

    static int n;
    static int m;
    static int[] arr = new int[10];
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);

        // FIXME: 2023/11/29
        recur(0);

        bw.flush();
        bw.close();
        br.close();
    }

    private static void recur(int k) throws IOException {
        // base condition
    }
}
