package backjoon;

import java.io.*;

/**
 * [브론즈 5] 그대로 출력하기 : https://www.acmicpc.net/problem/11718
 */
public class BOJ11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = null;

        while ((input = br.readLine()) != null) {
            bw.write(input);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
