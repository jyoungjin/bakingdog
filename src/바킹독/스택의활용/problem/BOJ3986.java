package 바킹독.스택의활용.problem;

import java.io.*;
import java.util.Stack;

/**
 * [실버 4] 좋은 단어 : https://www.acmicpc.net/problem/3986
 */
public class BOJ3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();
            for (char c : input.toCharArray()) {
                if (!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
