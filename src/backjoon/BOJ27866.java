package backjoon;

import java.io.*;

/**
 * [브론즈 5] 문자와 문자열 : https://www.acmicpc.net/problem/27866
 */
public class BOJ27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int i = Integer.parseInt(br.readLine());
        bw.write(input.toCharArray()[i - 1]);
        bw.flush();
        bw.close();
        br.close();
    }
}
