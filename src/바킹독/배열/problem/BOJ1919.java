package 바킹독.배열.problem;

import java.io.*;

/**
 * 애너그램 만들기 : https://www.acmicpc.net/problem/1919
 */
public class BOJ1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;

        char[] charArray1 = br.readLine().toCharArray();
        char[] charArray2 = br.readLine().toCharArray();

        // 97~122
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (char c : charArray1) {
            arr1[c - 97]++;
        }
        for (char c : charArray2) {
            arr2[c - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            answer += Math.abs(arr1[i] - arr2[i]);
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
