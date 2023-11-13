package 바킹독.스택.problem;

import java.io.*;
import java.util.Stack;

/**
 * 스택 : https://www.acmicpc.net/problem/10828
 */
public class BOJ10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String string = br.readLine();
            if (string.startsWith("push")) {
                stack.push(Integer.valueOf(string.split(" ")[1]));
            }
            if (string.equals("pop")) {
                bw.write(stack.isEmpty() ? "-1" : String.valueOf(stack.pop()));
                bw.newLine();
            }
            if (string.equals("size")) {
                bw.write(String.valueOf(stack.size()));
                bw.newLine();
            }
            if (string.equals("empty")) {
                bw.write(stack.isEmpty() ? "1" : "0");
                bw.newLine();
            }
            if (string.equals("top")) {
                bw.write(stack.isEmpty() ? "-1" : String.valueOf(stack.peek()));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
