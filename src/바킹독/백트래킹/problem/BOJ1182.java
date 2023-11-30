package 바킹독.백트래킹.problem;

import java.io.*;

/**
 * [실버 2] 부분 수열의 합 : https://www.acmicpc.net/problem/1182
 */
public class BOJ1182 {

    static int n;
    static int s;
    static int[] arr;
    static boolean[] isUsed;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        s = Integer.parseInt(str[1]);

        arr = new int[n];
        isUsed = new boolean[n];

        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }

        recur(0, 0);

        // 부분 수열이 공집합인 경우 예외처리
        if (s == 0) {
            cnt--;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }

    private static void recur(int k, int sum) throws IOException {
        // base condition
        if (k == n) {
            if (sum == s) {
                cnt++;
            }
            return;
        }
        recur(k + 1, sum);
        recur(k + 1, sum + arr[k]);
    }
}
