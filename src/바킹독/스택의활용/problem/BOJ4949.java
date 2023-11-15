package 바킹독.스택의활용.problem;

import java.io.*;
import java.util.Stack;

/**
 * [실버 4] 균형잡힌 세상 : https://www.acmicpc.net/problem/4949
 */
public class BOJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = br.readLine();
            if (input.equals(".")) break;

            Stack<Character> stack = new Stack<>();

            for (char c : input.toCharArray()) {
                if (c == '[' || c == '(') {
                    stack.push(c);
                    continue;
                }
                if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        stack.push('x');
                        break;
                    }
                    stack.pop();
                }
                if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        stack.push('x');
                        break;
                    }
                    stack.pop();
                }
            }

            bw.write(stack.isEmpty() ? "yes" : "no");
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
