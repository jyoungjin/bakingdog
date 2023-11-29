package 바킹독.재귀.problem;

import java.io.*;

/**
 * [골드 5] 하노이 탑 이동 순서 : https://www.acmicpc.net/problem/11729
 */
public class BOJ11729 {
    static BufferedReader br;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf((int) Math.pow(2, n) - 1));
        bw.newLine();

        recursion(1, 3, n);

        bw.flush();
        bw.close();
        br.close();
    }

    private static void recursion(int a, int b, int n) throws IOException {
        // base condition
        if (n == 1) {
            bw.write(a + " " + b);
            return;
        }
        recursion(a, 6 - a - b, n - 1);
        bw.newLine();
        bw.write(a + " " + b);
        bw.newLine();
        recursion(6 - a - b, b, n - 1);
    }
}
