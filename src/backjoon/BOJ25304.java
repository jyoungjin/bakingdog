package backjoon;

import java.io.*;

/**
 * [브론즈 4] 영수증 : https://www.acmicpc.net/problem/25304
 */
public class BOJ25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total =  Integer.parseInt(br.readLine());
        int n =  Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            sum += Integer.parseInt(s[0]) * Integer.parseInt(s[1]);
        }

        bw.write(total == sum ? "Yes" : "No");
        bw.flush();
        bw.close();
        br.close();
    }
}
