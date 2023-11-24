package 바킹독.bfs.problem;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * [실버 2] 유기농 배추 : https://www.acmicpc.net/problem/1012
 */
public class BOJ1012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());

        for (int i = 0; i < x; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[][] board = new int[m][n];
            boolean[][] visit = new boolean[m][n];
            int[] dx = {1, 0, -1, 0};
            int[] dy = {0, 1, 0, -1};

            int res = 0;

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                board[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            for (int a = 0; a < m; a++) {
                for (int b = 0; b < n; b++) {
                    if (board[a][b] == 1 && !visit[a][b]) {
                        Queue<Position> queue = new LinkedList<>();
                        visit[a][b] = true;
                        queue.add(new Position(a, b));
                        while (!queue.isEmpty()) {
                            Position poll = queue.poll();
                            for (int j = 0; j < 4; j++) {
                                int nx = poll.x + dx[j];
                                int ny = poll.y + dy[j];
                                if (nx < 0 || ny < 0 || nx >= m || ny >= n) {
                                    continue;
                                }
                                if (visit[nx][ny] || board[nx][ny] != 1) {
                                    continue;
                                }
                                visit[nx][ny] = true;
                                queue.add(new Position(nx, ny));
                            }
                        }
                        res++;
                    }
                }
            }

            bw.write(String.valueOf(res));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    static class Position {
        int x;
        int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

