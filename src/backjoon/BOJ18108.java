package backjoon;

import java.io.*;

/**
 * [브론즈 5] 1998년생인 내가 태국에서는 2541년생?! : https://www.acmicpc.net/problem/18108
 */
public class BOJ18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n =  Integer.parseInt(br.readLine());
        bw.write(String.valueOf(n - 543));
        bw.flush();
        bw.close();
        br.close();
    }
}
