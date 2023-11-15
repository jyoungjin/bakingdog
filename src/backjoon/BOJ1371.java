package backjoon;

import java.io.*;

/**
 * [브론즈 2] 가장 많은 글자 : https://www.acmicpc.net/problem/1371
 */
public class BOJ1371 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[26];
        String input = null;

        while ((input = br.readLine()) != null) {
            for (char c : input.toCharArray()) {
                if (c != ' ') {
                    array[c - 97]++;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                bw.write((char) (i + 97));
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
