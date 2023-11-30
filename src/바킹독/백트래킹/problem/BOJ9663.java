package 바킹독.백트래킹.problem;

import java.io.*;

/**
 * [골드 4] N-Queen : https://www.acmicpc.net/problem/9663
 */
public class BOJ9663 {

    static int n;
    static int cnt = 0;

    static boolean[] isUsed1;
    static boolean[] isUsed2;
    static boolean[] isUsed3;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        isUsed1 = new boolean[n + 1];
        isUsed2 = new boolean[2 * n + 2];
        isUsed3 = new boolean[2 * n + 2];

        recur(0);
        System.out.println(cnt);

        bw.flush();
        bw.close();
        br.close();
    }

    private static void recur(int cur) {
        if (cur == n) {
            cnt++;
            return;
        }

        int x = cur + 1;
        for (int i = 1; i <= n; i++) {
            if (!isUsed1[i] && !isUsed2[x + i] && !isUsed3[x - i + n - 1]) {
                isUsed1[i] = true;
                isUsed2[x + i] = true;
                isUsed3[x - i + n - 1] = true;
                recur(cur + 1);
                isUsed1[i] = false;
                isUsed2[x + i] = false;
                isUsed3[x - i + n - 1] = false;
            }
        }
    }
}
