package backjoon;

import java.io.*;

/**
 * [브론즈 5] 아스키 코드 : https://www.acmicpc.net/problem/11654
 */
public class BOJ11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char c = br.readLine().toCharArray()[0];

        bw.write(String.valueOf((int) c));
        bw.flush();
        bw.close();
        br.close();
    }
}
