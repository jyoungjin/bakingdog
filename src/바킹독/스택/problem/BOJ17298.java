package 바킹독.스택.problem;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * [골드 4] 오큰수 : https://www.acmicpc.net/problem/17298
 */
public class BOJ17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> inputStack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            inputStack.add(Integer.valueOf(st.nextToken()));
        }
        Stack<Integer> stack = new Stack<>();
        int[] resultArray = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            Integer lastNum = inputStack.pop();
            while (!stack.isEmpty() && lastNum >= stack.peek()) {
                stack.pop();
            }
            resultArray[i] = !stack.isEmpty() ? stack.peek() : -1;
            stack.push(lastNum);
        }

        for (int i = 0; i < resultArray.length; i++) {
            bw.write(String.valueOf(resultArray[i]));
            if (i < resultArray.length - 1) {
                bw.write(" ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
