package 바킹독.기초코드작성요령II.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 핸드폰 요금
 */
public class BOJ1267 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int yPrice = 0;
        int mPrice = 0;

        for (int times : array) {
            yPrice += 10 * (times / 30);
            mPrice += 15 * (times / 60);

            yPrice += times % 30 != 29 ? 10 : 0;
            mPrice += times % 60 != 59 ? 15 : 0;
        }

        if (yPrice > mPrice) {
            System.out.println("M " + mPrice);
        }

        if (mPrice > yPrice) {
            System.out.println("Y " + yPrice);
        }

        if (mPrice == yPrice) {
            System.out.println("Y M " + mPrice);
        }

    }
}
