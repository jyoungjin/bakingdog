package 바킹독.배열.problem;

import java.io.*;

/**
 * 방 배정 : https://www.acmicpc.net/problem/13300
 */
public class BOJ13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[][] array = new int[6][2];

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            int s = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[1]);
            array[y - 1][s]++;
        }

        for (int[] ints : array) {
            for (int anInt : ints) {
                answer += anInt / k;
                if (anInt % k != 0) {
                    answer += 1;
                }
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
