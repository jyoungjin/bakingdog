package backjoon;

import java.io.*;

/**
 * [브론즈 2] 오각형, 오각형, 오각형… : https://www.acmicpc.net/problem/1964
 */
public class BOJ1964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n =  Integer.parseInt(br.readLine());
        long result = 5;
        for (long i = 2; i <= n; i++) {
            result += i * 3 + 1;
        }
        bw.write(String.valueOf(result % 45678));
        bw.flush();
        bw.close();
        br.close();
    }
}
