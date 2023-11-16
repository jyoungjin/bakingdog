package 바킹독.bfs.problem;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * [골드 5] 토마토 : https://www.acmicpc.net/problem/7576
 */
public class BOJ7576 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] board = new int[n][m];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        Queue<Position> queue = new LinkedList();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int input = Integer.parseInt(st.nextToken());
                board[i][j] = input;
                if (input == 1) {
                    queue.add(new Position(i, j));
                }
            }
        }

        while (!queue.isEmpty()) {
            Position position = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = position.x + dx[i];
                int ny = position.y + dy[i];
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }
                if (board[nx][ny] != 0) {
                    continue;
                }
                board[nx][ny] = board[position.x][position.y] + 1;
                queue.add(new Position(nx, ny));
            }
        }

        int max = 0;

        Loop1 :
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0) {
                    max = -1;
                    break Loop1;
                }
                max = Math.max(max, board[i][j]);
            }
        }

        bw.write(max != -1 ? String.valueOf(max - 1) : "-1");
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