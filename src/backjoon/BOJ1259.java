package backjoon;

import java.io.*;

/**
 * [브론즈 1] 펠린드롬수 : https://www.acmicpc.net/problem/1259
 */
public class BOJ1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }
            String compare = new StringBuilder(input).reverse().toString();
            bw.write(input.equals(compare) ? "yes" : "no");
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
