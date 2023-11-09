package 바킹독.배열.problem;

import java.io.*;

/**
 * 개수 세기 : https://www.acmicpc.net/problem/10807
 */
public class BOJ10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        int x = Integer.parseInt(br.readLine());

        for (String value : array) {
            if (Integer.parseInt(value) == x) {
                answer++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
