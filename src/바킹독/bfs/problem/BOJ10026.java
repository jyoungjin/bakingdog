package 바킹독.bfs.problem;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * [골드 5] 적록색약 : https://www.acmicpc.net/problem/10026
 */
public class BOJ10026 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        char[][] board = new char[n][n];
        boolean[][] visit = new boolean[n][n];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            char[] charArray = br.readLine().toCharArray();
            for (int j = 0; j < n; j++) {
                board[i][j] = charArray[j];
            }
        }

        Queue<Position> queue = new LinkedList();
        int res1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j]) {
                    visit[i][j] = true;
                    queue.add(new Position(i, j));
                    while (!queue.isEmpty()) {
                        Position poll = queue.poll();
                        for (int k = 0; k < 4; k++) {
                            int nx = poll.x + dx[k];
                            int ny = poll.y + dy[k];
                            if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                                continue;
                            }
                            if (board[nx][ny] != board[i][j] || visit[nx][ny]) {
                                continue;
                            }
                            visit[nx][ny] = true;
                            queue.add(new Position(nx, ny));
                        }
                    }
                    res1++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'G') {
                    board[i][j] = 'R';
                }
                visit[i][j] = false;
            }
        }


        int res2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j]) {
                    visit[i][j] = true;
                    queue.add(new Position(i, j));
                    while (!queue.isEmpty()) {
                        Position poll = queue.poll();
                        for (int k = 0; k < 4; k++) {
                            int nx = poll.x + dx[k];
                            int ny = poll.y + dy[k];
                            if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
                                continue;
                            }
                            if (board[nx][ny] != board[i][j] || visit[nx][ny]) {
                                continue;
                            }
                            visit[nx][ny] = true;
                            queue.add(new Position(nx, ny));
                        }
                    }
                    res2++;
                }
            }
        }


        bw.write(res1 + " " + res2);
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
