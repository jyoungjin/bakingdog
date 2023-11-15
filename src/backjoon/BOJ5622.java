package backjoon;

import java.io.*;

/**
 * [브론즈 2] 다이얼 : https://www.acmicpc.net/problem/5622
 */
public class BOJ5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int result = 0;

        for (char c : input.toCharArray()) {
            if (c == 'A' || c == 'B' || c == 'C') {
                result += 3;
            }
            if (c == 'D' || c == 'E' || c == 'F') {
                result += 4;
            }
            if (c == 'G' || c == 'H' || c == 'I') {
                result += 5;
            }
            if (c == 'J' || c == 'K' || c == 'L') {
                result += 6;
            }
            if (c == 'M' || c == 'N' || c == 'O') {
                result += 7;
            }
            if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
                result += 8;
            }
            if (c == 'T' || c == 'U' || c == 'V') {
                result += 9;
            }
            if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') {
                result += 10;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
