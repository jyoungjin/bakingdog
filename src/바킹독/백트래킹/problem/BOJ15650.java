package 바킹독.백트래킹.problem;

import java.io.*;

/**
 * [실버 3] N과 M (2) : https://www.acmicpc.net/problem/15650
 */
public class BOJ15650 {

    static int n;
    static int m;
    static int[] arr = new int[10];
    static boolean[] isUsed = new boolean[10];
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);

        recur(0);

        bw.flush();
        bw.close();
        br.close();
    }

    private static void recur(int k) throws IOException {
        // base condition
        if (k == m) {
            for (int i = 0; i < m; i++) {
                bw.write(arr[i] + " ");
            }
            bw.newLine();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (k != 0 && i <= arr[k - 1]) {
                continue;
            }
            if (!isUsed[i]) {
                arr[k] = i;
                isUsed[i] = true;
                recur(k + 1);
                isUsed[i] = false;
            }
        }
    }
}
