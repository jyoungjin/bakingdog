package backjoon;

import java.io.*;

/**
 * [브론즈 5] 단어 길이 재기 : https://www.acmicpc.net/problem/2743
 */
public class BOJ2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        bw.write(String.valueOf(input.length()));
        bw.flush();
        bw.close();
        br.close();
    }
}
