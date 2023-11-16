package backjoon;

import java.io.*;

/**
 * [브론즈 2] 분산처리 : https://www.acmicpc.net/problem/1009
 */
public class BOJ1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n =  Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            int x = 1;
            for (int j = 0; j < b; j++) {
                x = (x * a) % 10;
            }
            bw.write(String.valueOf(x == 0 ? 10 : x));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
