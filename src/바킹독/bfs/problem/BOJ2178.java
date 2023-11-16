package 바킹독.bfs.problem;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * [실버 1] 미로 탐색 : https://www.acmicpc.net/problem/2178
 */
public class BOJ2178 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] board = new int[n][m];
        int[][] dist = new int[n][m];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            char[] charArray = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                board[i][j] = Character.getNumericValue(charArray[j]);
                dist[i][j] = -1;
            }
        }

        Queue<Position> queue = new LinkedList();
        queue.add(new Position(0, 0));
        dist[0][0] = 1;

        while (!queue.isEmpty()) {
            Position position = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = position.x + dx[i];
                int ny = position.y + dy[i];
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }
                if (board[nx][ny] != 1 || dist[nx][ny] >= 0) {
                    continue;
                }
                dist[nx][ny] = dist[position.x][position.y] + 1;
                queue.add(new Position(nx, ny));
            }
        }

        bw.write(String.valueOf(dist[n-1][m-1]));
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

