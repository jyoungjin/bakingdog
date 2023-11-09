package 바킹독.기초코드작성요령II.problem;

import java.io.*;

/**
 * 별 찍기 - 9
 */
public class BOJ2446 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 2 * n - 1; j > 0; j--) {
                bw.write(Math.abs(j - n) <= i ? "*" : j - n > 0 ? " " : "");
            }
            bw.write("\n");
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                bw.write(Math.abs(j - n) <= i ? "*" : j - n > 0 ? "" : " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}