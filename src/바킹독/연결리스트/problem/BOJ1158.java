package 바킹독.연결리스트.problem;

import java.io.*;
import java.util.LinkedList;

/**
 * 요세푸스 문제 : https://www.acmicpc.net/problem/1158
 */
public class BOJ1158 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        bw.write("<");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(i + 1);
        }

        while (!linkedList.isEmpty()) {
            for (int i = 0; i < k; i++) {
                if (i == k - 1) {
                    if (linkedList.size() == 1) {
                        bw.write(String.valueOf(linkedList.get(0)));
                    } else {
                        bw.write(linkedList.get(0) + ", ");
                    }
                    linkedList.remove(0);
                } else {
                    linkedList.add(linkedList.remove(0));
                }
            }
        }

        bw.write(">");
        bw.flush();
    }
}
