package 바킹독.기초코드작성요령II.problem;

import java.io.*;

/**
 * 별 찍기 - 8
 */
public class BOJ2445 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                bw.write("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                bw.write(" ");
            }
            for (int j = 1; j <= i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                bw.write("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                bw.write(" ");
            }
            for (int j = 1; j <= i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}