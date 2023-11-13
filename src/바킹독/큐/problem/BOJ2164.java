package 바킹독.큐.problem;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * [실버 4] 카드2 : https://www.acmicpc.net/problem/2164
 */
public class BOJ2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            queue.poll();
            queue.add(queue.poll());
        }

        bw.write(String.valueOf(queue.element()));
        bw.flush();
        bw.close();
        br.close();
    }
}
