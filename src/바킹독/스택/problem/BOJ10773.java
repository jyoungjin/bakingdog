package 바킹독.스택.problem;

import java.io.*;
import java.util.Stack;

/**
 * 제로 : https://www.acmicpc.net/problem/10773
 */
public class BOJ10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0 && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(x);
            }
        }

        while (!stack.isEmpty()) {
            answer += stack.pop();
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
