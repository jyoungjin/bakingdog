package 바킹독.기초코드작성요령II.problem;

import java.io.*;

/**
 * 별 찍기 - 5
 */
public class BOJ2442 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
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