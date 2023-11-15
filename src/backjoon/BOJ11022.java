package backjoon;

import java.io.*;

/**
 * [브론즈 5] A+B - 8 : https://www.acmicpc.net/problem/11022
 */
public class BOJ11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n =  Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            String[] s = br.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            bw.write("Case #" + i + ": " + x + " + " + y + " = " + (x + y));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
