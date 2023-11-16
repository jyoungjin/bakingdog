package 바킹독.스택.problem;

import java.io.*;
import java.util.*;

/**
 * [골드 5] 옥상 정원 꾸미기 : https://www.acmicpc.net/problem/6198
 */
public class BOJ6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        long result = 0;
        Stack<Integer> stack = new Stack<>();
        while (n-- != 0) {
            int height = Integer.parseInt(br.readLine());
            while (!stack.isEmpty() && stack.peek() <= height) {
                stack.pop();
            }
            result += stack.size();
            stack.push(height);
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
