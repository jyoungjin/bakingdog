package 바킹독.배열.problem;

import java.io.*;

/**
 * 두 수의 합 : https://www.acmicpc.net/problem/3273
 */
public class BOJ3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        int x = Integer.parseInt(br.readLine());

        int[] a = new int[1000001];

        for (String value : array) {
            if (x - Integer.parseInt(value) > 0 && x - Integer.parseInt(value) < 1000001) {
                if (a[x - Integer.parseInt(value)] == 1) {
                    answer++;
                }
            }
            a[Integer.parseInt(value)] = 1;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
