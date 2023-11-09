package 바킹독.배열.problem;

import java.io.*;
import java.util.Arrays;

/**
 * Strfry : https://www.acmicpc.net/problem/11328
 */
public class BOJ11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] strArray = br.readLine().split(" ");
            char[] charArray1 = strArray[0].toCharArray();
            char[] charArray2 = strArray[1].toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            bw.write(Arrays.equals(charArray1, charArray2) ? "Possible" : "Impossible");
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
