package 바킹독.연결리스트.problem;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.Collectors;

/**
 * 키로거 : https://www.acmicpc.net/problem/5397
 */
public class BOJ5397 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            LinkedList<Character> linkedList = br.readLine().chars().mapToObj(c -> (char) c).collect(Collectors.toCollection(LinkedList::new));
            LinkedList<Character> answer = new LinkedList<>();
            ListIterator<Character> iterator = answer.listIterator();

            for (Character c : linkedList) {
                switch (c) {
                    case '<':
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        break;
                    case '>':
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        break;
                    case '-':
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                            iterator.remove();
                        }
                        break;
                    default:
                        iterator.add(c);
                }
            }

            while (iterator.hasPrevious()) {
                iterator.previous();
            }

            StringBuilder stringBuilder = new StringBuilder();
            for (Character c : answer) {
                stringBuilder.append(c);
            }
            bw.write(stringBuilder.toString());
            bw.newLine();
        }
        bw.flush();
    }
}
