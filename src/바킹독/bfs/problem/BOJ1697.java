package 바킹독.bfs.problem;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * [실버 1] 숨바꼭질 : https://www.acmicpc.net/problem/1697
 */
public class BOJ1697 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Position> queue = new LinkedList<>();
        boolean[] visited = new boolean[100001];
        Arrays.fill(visited, false);
        queue.add(new Position(n, 0));
        visited[n] = true;

        while (!queue.isEmpty()) {
            Position p = queue.poll();

            if (p.idx < 0 || p.idx > 100000) {
                continue;
            }

            if (p.idx == k) {
                System.out.println(p.count);
                break;
            }

            if (p.idx >= 1 && !visited[p.idx - 1]) {
                queue.add(new Position(p.idx - 1, p.count + 1));
                visited[p.idx - 1] = true;
            }
            if (p.idx + 1 < 100001 && !visited[p.idx + 1]) {
                queue.add(new Position(p.idx + 1, p.count + 1));
                visited[p.idx + 1] = true;
            }
            if (p.idx * 2 < 100001 && !visited[p.idx * 2]) {
                queue.add(new Position(p.idx * 2, p.count + 1));
                visited[p.idx * 2] = true;
            }
        }
    }

    static class Position {
        int idx;
        int count;

        Position(int idx, int count) {
            this.idx = idx;
            this.count = count;
        }
    }
}