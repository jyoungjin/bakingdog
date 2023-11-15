package 바킹독.스택의활용.problem;

import java.io.*;
import java.util.Stack;

/**
 * [골드 5] 괄호의 값 : https://www.acmicpc.net/problem/2504
 * TC : (()[[]])([]) - 28
 */
public class BOJ2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;
        int num = 1; // 곱해질 값

        char[] charArray = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(') {
                num *= 2; // 소괄호가 나오면 곱해질 값 2배 증가
                stack.push(charArray[i]);
            } else if (charArray[i] == '[') {
                num *= 3; // 대괄호가 나오면 곱해질 값 3배 증가
                stack.push(charArray[i]);
            } else if (charArray[i] == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    result = 0;
                    break;
                }
                if (charArray[i - 1] == '(') {
                    // 직전 괄호가 여는 괄호였다면 sum에 값 추가
                    result += num;
                }
                stack.pop();
                // 소괄호 쌍이 사라졌으니 2로 나눔
                num /= 2;
            } else {
                if (stack.isEmpty() || stack.peek() != '[') {
                    result = 0;
                    break;
                }
                if (charArray[i - 1] == '[') {
                    result += num;
                }
                stack.pop();
                num /= 3;
            }
        }

        bw.write(stack.isEmpty() ? String.valueOf(result) : "0");
        bw.flush();
        bw.close();
        br.close();
    }
}
