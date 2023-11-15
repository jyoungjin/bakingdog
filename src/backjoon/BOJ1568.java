package backjoon;

import java.io.*;

/**
 * [브론즈 2] 공 : https://www.acmicpc.net/problem/1568
 */
public class BOJ1568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int current = 1;
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);

            if (x == current) {
                current = y;
                continue;
            }
            if (y == current) {
                current = x;
                continue;
            }
        }

        bw.write(String.valueOf(current));
        bw.flush();
        bw.close();
        br.close();
    }
}
