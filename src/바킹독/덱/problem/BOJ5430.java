package 바킹독.덱.problem;

import java.io.*;
import java.util.*;

/**
 * [골드 5] AC : https://www.acmicpc.net/problem/5430
 */
public class BOJ5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            char[] commandList = br.readLine().toCharArray();
            int size = Integer.parseInt(br.readLine());
            String arrayString = br.readLine().replaceAll("\\[", "").replaceAll("\\]", "");
            String[] strArray = arrayString.split(",");

            Deque<Integer> deque = new ArrayDeque<>();
            for (String x : strArray) {
                if (!x.equals("")) {
                    deque.offerLast(Integer.parseInt(x));
                }
            }

            boolean isLeft = true;
            boolean isSuccess = true;

            for (char c : commandList) {
                if (c == 'R') {
                    isLeft = !isLeft;
                } else {
                    if (!deque.isEmpty()) {
                        if (isLeft) {
                            deque.pollFirst();
                        } else {
                            deque.pollLast();
                        }
                    } else {
                        isSuccess = false;
                        break;
                    }
                }
            }


            if (!isSuccess) {
                bw.write("error");
            } else {
                StringBuilder sb = new StringBuilder("[");
                if (isLeft) {
                    while (!deque.isEmpty()) {
                        sb.append(deque.pollFirst());
                        if (!deque.isEmpty()) {
                            sb.append(",");
                        }
                    }
                } else {
                    while (!deque.isEmpty()) {
                        sb.append(deque.pollLast());
                        if (!deque.isEmpty()) {
                            sb.append(",");
                        }
                    }
                }
                sb.append("]");
                bw.write(sb.toString());
            }
            bw.newLine();

        }

        bw.flush();
        bw.close();
        br.close();
    }
}
