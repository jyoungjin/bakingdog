package 바킹독.스택의활용.problem;

import java.io.*;
import java.util.Stack;

/**
 * [실버 4] 괄호 : https://www.acmicpc.net/problem/9012
 */
public class BOJ9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();
            for (char c : input.toCharArray()) {
                if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        stack.push('x');
                        break;
                    }
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            bw.write(stack.isEmpty() ? "YES" : "NO");
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
