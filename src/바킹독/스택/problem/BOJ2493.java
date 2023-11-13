package 바킹독.스택.problem;

import java.io.*;
import java.util.Stack;

/**
 * [골드 5] 탑 : https://www.acmicpc.net/problem/2493
 */
class Top {
    int num;
    int height;

    Top(int num, int height) {
        this.num = num;
        this.height = height;
    }
}

public class BOJ2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Top> stack = new Stack<>();
        String[] array = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            int height = Integer.parseInt(array[i - 1]);
            if (stack.isEmpty()) {
                stack.push(new Top(i, height));
                sb.append("0 ");
            } else {
                while (true) {
                    if (stack.isEmpty()) {
                        stack.push(new Top(i, height));
                        sb.append("0 ");
                        break;
                    }

                    Top peek = stack.peek();
                    if (peek.height > height) {
                        sb.append(peek.num).append(" ");
                        stack.push(new Top(i, height));
                        break;
                    }
                    stack.pop();
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
