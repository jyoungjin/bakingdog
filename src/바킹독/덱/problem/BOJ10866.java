package 바킹독.덱.problem;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * [실버 4] 덱 : https://www.acmicpc.net/problem/10866
 */
public class BOJ10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String string = br.readLine();
            if (string.startsWith("push_front")) {
                Integer value = Integer.valueOf(string.split(" ")[1]);
                queue.offerFirst(value);
            }
            if (string.startsWith("push_back")) {
                Integer value = Integer.valueOf(string.split(" ")[1]);
                queue.offerLast(value);
            }
            if (string.equals("pop_front")) {
                bw.write(queue.isEmpty() ? "-1" : String.valueOf(queue.pollFirst()));
                bw.newLine();
            }
            if (string.equals("pop_back")) {
                bw.write(queue.isEmpty() ? "-1" : String.valueOf(queue.pollLast()));
                bw.newLine();
            }
            if (string.equals("size")) {
                bw.write(String.valueOf(queue.size()));
                bw.newLine();
            }
            if (string.equals("empty")) {
                bw.write(queue.isEmpty() ? "1" : "0");
                bw.newLine();
            }
            if (string.equals("front")) {
                bw.write(queue.isEmpty() ? "-1" : String.valueOf(queue.peekFirst()));
                bw.newLine();
            }
            if (string.equals("back")) {
                bw.write(queue.isEmpty() ? "-1" : String.valueOf(queue.peekLast()));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
