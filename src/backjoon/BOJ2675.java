package backjoon;

import java.io.*;

/**
 * [브론즈 5] 문자열 반복 : https://www.acmicpc.net/problem/2675
 */
public class BOJ2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n =  Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] array = br.readLine().split(" ");
            int r = Integer.parseInt(array[0]);
            char[] charArray = array[1].toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c : charArray) {
                sb.append(String.valueOf(c).repeat(r));
            }

            bw.write(sb.toString());
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
