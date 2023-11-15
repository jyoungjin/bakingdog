package backjoon;

import java.io.*;

/**
 * [브론즈 5] A+B - 7 : https://www.acmicpc.net/problem/11021
 */
public class BOJ11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n =  Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            String[] s = br.readLine().split(" ");
            bw.write("Case #" + i + ": " + String.valueOf(Integer.parseInt(s[0]) + Integer.parseInt(s[1])));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
