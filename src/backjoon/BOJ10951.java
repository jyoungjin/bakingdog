package backjoon;

import java.io.*;

/**
 * [브론즈 5] A+B - 4 : https://www.acmicpc.net/problem/10951
 */
public class BOJ10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = null;
        while ((input = br.readLine()) != null) {
            String[] s = input.split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            bw.write(String.valueOf(x + y));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
