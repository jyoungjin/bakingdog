package backjoon;

import java.io.*;

/**
 * [브론즈 3] 알람 시계 : https://www.acmicpc.net/problem/2884
 */
public class BOJ2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int hour = Integer.parseInt(s[0]);
        int min = Integer.parseInt(s[1]);

        if (min - 45 >= 0) {
            bw.write(hour + " " + (min - 45));
        } else {
            if (hour == 0) {
                bw.write("23 " + (min - 45 + 60));
            } else {
                bw.write((hour - 1) + " " + (min - 45 + 60));
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
