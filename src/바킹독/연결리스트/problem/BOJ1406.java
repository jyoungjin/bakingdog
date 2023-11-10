package 바킹독.연결리스트.problem;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 에디터 : https://www.acmicpc.net/problem/1406
 * index로 접근해 수정 하면 시간 초과 발생, 따라서 iterator 사용
 */
public class BOJ1406 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<Character> linkedList = br.readLine().chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(LinkedList::new));
        ListIterator<Character> iterator = linkedList.listIterator();
        int n = Integer.parseInt(br.readLine());

        while (iterator.hasNext()) {
            iterator.next();
        }

        for (int i = 0; i < n; i++) {
            char[] charArray = br.readLine().toCharArray();
            char method = charArray[0];
            if (method == 'L') {
                if (iterator.hasPrevious()) {
                    iterator.previous();
                }
                continue;
            }
            if (method == 'D') {
                if (iterator.hasNext()) {
                    iterator.next();
                }
                continue;
            }
            if (method == 'B') {
                if (iterator.hasPrevious()) {
                    iterator.previous();
                    iterator.remove();
                }
                continue;
            }
            if (method == 'P') {
                iterator.add(charArray[2]);
            }
        }

        while (iterator.hasPrevious()) {
            iterator.previous();
        }

        StringBuilder answer = new StringBuilder();
        for (Character c : linkedList) {
            answer.append(c);
        }

        bw.write(answer.toString());
        bw.flush();
    }
}
