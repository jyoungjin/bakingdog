package 바킹독.백트래킹.problem;

import java.io.*;
import java.util.*;

/**
 * [실버 2] N과 M (9) : https://www.acmicpc.net/problem/15663
 */
public class BOJ15663 {

    static int n;
    static int m;
    static int[] arr;
    static int[] res = new int[10];
    static boolean[] visited = new boolean[10];

    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);

        arr = new int[n];
        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }
        Arrays.sort(arr);

        recur(0);

        bw.flush();
        bw.close();
        br.close();
    }

    private static void recur(int k) throws IOException {
        // base condition
        if (k == m) {
            for (int i = 0; i < m; i++) {
                bw.write(res[i] + " ");
            }
            bw.newLine();
            return;
        }

        int tmp = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i] && tmp != arr[i]) {
                visited[i] = true;
                res[k] = arr[i];
                tmp = res[k];
                recur(k + 1);
                visited[i] = false;
            }
        }
    }
}
