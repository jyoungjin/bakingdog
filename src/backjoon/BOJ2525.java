package backjoon;

import java.io.*;

/**
 * [브론즈 3] 오븐 시계 : https://www.acmicpc.net/problem/2525
 */
public class BOJ2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int hour = Integer.parseInt(s[0]);
        int min = Integer.parseInt(s[1]) + Integer.parseInt(br.readLine());
        int remain = 0;

        if (min >= 60) {
            hour += min / 60;
            min = min % 60;
        }

        if (hour >= 24) {
            hour = hour - 24;
        }
        bw.write(hour + " " + min);
        bw.flush();
        bw.close();
        br.close();
    }
}
