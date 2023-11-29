package 바킹독.재귀.problem;

import java.io.*;

/**
 * [실버 2] 종이의 개수 : https://www.acmicpc.net/problem/1780
 */
public class BOJ1780 {

    static int[][] board;
    static int minus = 0;
    static int zero = 0;
    static int plus = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(s[j]);
            }
        }
        recur(n, 0, 0);
        bw.write(String.valueOf(minus));
        bw.newLine();
        bw.write(String.valueOf(zero));
        bw.newLine();
        bw.write(String.valueOf(plus));
        bw.flush();
        bw.close();
        br.close();
    }

    private static void recur(int n, int x, int y) {
        // base condition
        if (checkBoard(n, x, y)) {
            if (board[x][y] == -1) {
                minus++;
            } else if (board[x][y] == 0) {
                zero++;
            } else {
                plus++;
            }
            return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                recur(n / 3, x + i * n / 3, y + j * n / 3);
            }
        }
    }

    private static boolean checkBoard(int n, int x, int y) {
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (board[i][j] != board[x][y]) {
                    return false;
                }
            }
        }
        return true;
    }
}
