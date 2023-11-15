package backjoon;

import java.io.*;

/**
 * [브론즈 5] 꼬마 정민 : https://www.acmicpc.net/problem/11382
 */
public class BOJ11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long result = 0;
        for (String string : br.readLine().split(" ")) {
            result += Long.parseLong(string);
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
