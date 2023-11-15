package 바킹독.스택의활용.problem;

import java.io.*;
import java.util.Stack;

/**
 * [실버 2] 쇠막대기 : https://www.acmicpc.net/problem/10799
 */
public class BOJ10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ')') {
                stack.pop();
                if (charArray[i - 1] == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            } else {
                stack.push(charArray[i]);
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}