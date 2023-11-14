package 바킹독.덱.problem;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * [실버 3] 회전하는 큐 : https://www.acmicpc.net/problem/1021
 */
public class BOJ1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;
        String[] array = br.readLine().split(" ");
        int n = Integer.parseInt(array[0]);
        int m = Integer.parseInt(array[1]);

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            deque.offerLast(i);
        }

        String[] s = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            int x = Integer.parseInt(s[i]);

            Iterator<Integer> iterator = deque.iterator();
            int idx = 0;
            if (deque.peekFirst() != x) {
                while (iterator.hasNext()) {
                    if (iterator.next() == x) {
                        break;
                    }
                    idx++;
                }
            }

            if (idx <= (deque.size() / 2)) {
                while (deque.peekFirst() != x) {
                    deque.offerLast(deque.pollFirst());
                    answer++;
                }
            } else {
                while (deque.peekFirst() != x) {
                    deque.offerFirst(deque.pollLast());
                    answer++;
                }
            }

            deque.pollFirst();
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
        br.close();
    }
}
