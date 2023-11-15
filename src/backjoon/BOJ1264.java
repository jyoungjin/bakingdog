package backjoon;

import java.io.*;

/**
 * [브론즈 4] 모음의 개수 : https://www.acmicpc.net/problem/1264
 */
public class BOJ1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals("#")) {
                break;
            }
            int result = 0;

            for (char c : input.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    result++;
                }
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    result++;
                }
            }

            bw.write(String.valueOf(result));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
