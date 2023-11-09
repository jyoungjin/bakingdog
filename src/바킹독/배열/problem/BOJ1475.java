package 바킹독.배열.problem;

import java.io.*;

/**
 * 방 번호 : https://www.acmicpc.net/problem/1475
 */
public class BOJ1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] array = new int[10];
        char[] charArray = br.readLine().toCharArray();

        for (char c : charArray) {
            array[c - 48]++;
        }

        int max = (array[6] + array[9]) / 2 + (array[6] + array[9]) % 2;
        for (int i = 0; i < array.length; i++) {
            if (i != 6 && i != 9) {
                max = Math.max(max, array[i]);
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }
}
