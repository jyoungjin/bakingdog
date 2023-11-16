package 바킹독.덱.problem;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


/**
 * [플레티넘 5] 최솟값 찾기 : https://www.acmicpc.net/problem/11003
 */
public class BOJ11003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        Deque<Component> deque = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            while (!deque.isEmpty() && deque.peekLast().value > num) {
                deque.pollLast();
            }
            deque.offerLast(new Component(i, num));
            if (deque.peekFirst().index < i - l + 1) {
                deque.pollFirst();
            }
            bw.write(deque.peekFirst().value + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

class Component {
    int index;
    int value;

    public Component(int index, int value) {
        this.index = index;
        this.value = value;
    }
}
