package backjoon;

import java.io.*;

/**
 * [브론즈 5] 문자열 : https://www.acmicpc.net/problem/9086
 */
public class BOJ9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n =  Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            char[] charArray = input.toCharArray();
            bw.write(String.valueOf(charArray[0]) + String.valueOf(charArray[charArray.length - 1]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
