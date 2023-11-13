package 바킹독.스택.problem;

import java.io.*;
import java.util.*;

/**
 * [실버 2] 스택 수열 : https://www.acmicpc.net/problem/1874
 */
public class BOJ1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Stack<Integer> stack = new Stack<>();
        int cursor = 0;
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            stack.push(i);
            sb.append("+\n");
            while (cursor < n && !stack.isEmpty() && list.get(cursor).equals(stack.peek())) {
                stack.pop();
                sb.append("-\n");
                cursor++;
                cnt++;
            }
        }

        if (cnt == n) {
            bw.write(sb.toString());
        } else {
            bw.write("NO");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
