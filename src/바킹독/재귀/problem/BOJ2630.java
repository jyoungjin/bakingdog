package 바킹독.재귀.problem;

import java.io.*;

/**
 * [실버 2] 색종이 만들기 : https://www.acmicpc.net/problem/2630
 */
public class BOJ2630 {

    static int[][] board;
    static int blue = 0;
    static int white = 0;

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
        bw.write(String.valueOf(white));
        bw.newLine();
        bw.write(String.valueOf(blue));
        bw.flush();
        bw.close();
        br.close();
    }

    private static void recur(int n, int x, int y) {
        // base condition
        if (checkBoard(n, x, y)) {
            if (board[x][y] == 1) {
                blue++;
            } else {
                white++;
            }
            return;
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                recur(n / 2, x + i * n / 2, y + j * n / 2);
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
