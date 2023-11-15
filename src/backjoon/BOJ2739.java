package backjoon;

import java.io.*;

/**
 * [브론즈 5] 구구단 : https://www.acmicpc.net/problem/2739
 */
public class BOJ2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n =  Integer.parseInt(br.readLine());

        for (int i = 1; i <= 9; i++) {
            bw.write(n + " * " + i + " = " + (n * i));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
