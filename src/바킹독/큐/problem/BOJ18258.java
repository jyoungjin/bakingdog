package 바킹독.큐.problem;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * [실버 4] 큐 2 : https://www.acmicpc.net/problem/18258
 */
public class BOJ18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = "";

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String string = br.readLine();
            if (string.startsWith("push")) {
                Integer value = Integer.valueOf(string.split(" ")[1]);
                s = String.valueOf(value);
                queue.offer(value);
            }
            if (string.equals("pop")) {
                bw.write(queue.isEmpty() ? "-1" : String.valueOf(queue.poll()));
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
                bw.write(queue.isEmpty() ? "-1" : String.valueOf(queue.peek()));
                bw.newLine();
            }
            if (string.equals("back")) {
                bw.write(s.equals("") || queue.isEmpty() ? "-1" : s);
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
