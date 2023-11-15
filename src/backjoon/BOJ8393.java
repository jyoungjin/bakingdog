package backjoon;

import java.io.*;

/**
 * [브론즈 5] 합 : https://www.acmicpc.net/problem/8393
 */
public class BOJ8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n =  Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
