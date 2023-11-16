package 바킹독.bfs.problem;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * [실버 1] 그림 : https://www.acmicpc.net/problem/1926
 */
public class BOJ1926 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] board = new int[n][m];
        int[][] visit = new int[n][m];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxArea = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] != 1 || visit[i][j] == 1) {
                    continue;
                }
                visit[i][j] = 1;
                int area = 1;
                count++;

                Queue<Position> queue = new LinkedList<>();
                queue.add(new Position(i, j));

                while (!queue.isEmpty()) {
                    Position ps = queue.poll();
                    for (int k = 0; k < 4; k++) {
                        int nx = ps.x + dx[k];
                        int ny = ps.y + dy[k];
                        if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                            continue;
                        }
                        if (board[nx][ny] != 1 || visit[nx][ny] == 1) {
                            continue;
                        }
                        // 방문 표시
                        visit[nx][ny] = 1;
                        queue.add(new Position(nx, ny));
                        area++;
                    }
                }

                maxArea = Math.max(maxArea, area);
            }
        }

        bw.write(String.valueOf(count));
        bw.newLine();
        bw.write(String.valueOf(maxArea));
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

