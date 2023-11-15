package backjoon;

import java.io.*;

/**
 * [브론즈 2] 상수 : https://www.acmicpc.net/problem/2908
 */
public class BOJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(new StringBuilder(s[0]).reverse().toString());
        int y = Integer.parseInt(new StringBuilder(s[1]).reverse().toString());
        bw.write(x > y ? String.valueOf(x) : String.valueOf(y));

        bw.flush();
        bw.close();
        br.close();
    }
}
