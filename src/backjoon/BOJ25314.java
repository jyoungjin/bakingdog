package backjoon;

import java.io.*;

/**
 * [브론즈 4] 코딩은 체육과목 입니다 : https://www.acmicpc.net/problem/25314
 */
public class BOJ25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n =  Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int x = n / 4;

        sb.append("long ".repeat(Math.max(0, x)));
        sb.append("int");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
