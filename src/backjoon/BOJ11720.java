package backjoon;

import java.io.*;

/**
 * [브론즈 4] 숫자의 합 : https://www.acmicpc.net/problem/11720
 */
public class BOJ11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for (char c : br.readLine().toCharArray()) {
            result += Character.getNumericValue(c);
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
