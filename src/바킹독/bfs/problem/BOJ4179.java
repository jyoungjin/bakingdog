package 바킹독.bfs.problem;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * [골드 4] 불!  : https://www.acmicpc.net/problem/4179
 */
public class BOJ4179 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] board = new int[n][m];
        int[][] fireBoard = new int[n][m];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        Queue<Position> queue = new LinkedList<>();
        Position jihun = null;
        for (int i = 0; i < n; i++) {
            char[] charArray = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                if (charArray[j] == '#') {
                    fireBoard[i][j] = -1;
                    board[i][j] = -1;
                }
                if (charArray[j] == 'F') {
                    queue.add(new Position(i, j));
                    fireBoard[i][j] = 1;
                    board[i][j] = -1;
                }
                if (charArray[j] == 'J') {
                    jihun = new Position(i, j);
                    board[i][j] = 1;
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
                if (fireBoard[nx][ny] == -1 || fireBoard[nx][ny] > 0) {
                    continue;
                }
                fireBoard[nx][ny] = fireBoard[position.x][position.y] + 1;
                queue.add(new Position(nx, ny));
            }
        }


        Integer result = null;

        queue.add(jihun);
        Loop1 :
        while (!queue.isEmpty()) {
            Position position = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = position.x + dx[i];
                int ny = position.y + dy[i];
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    result = board[position.x][position.y];
                    break Loop1;
                }
                if (board[nx][ny] != 0) {
                    continue;
                }
                if (fireBoard[nx][ny] > 0 && board[position.x][position.y] + 1 >= fireBoard[nx][ny]) {
                    continue;
                }
                board[nx][ny] = board[position.x][position.y] + 1;
                queue.add(new Position(nx, ny));
            }
        }

        bw.write(result == null ? "IMPOSSIBLE" : String.valueOf(result));
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

// 3 4
//##.#
//FJ.#
//##F#