package 바킹독.기초코드작성요령II.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 카드 역배치
 */
public class BOJ10804 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] answer = new int[20];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = i + 1;
        }

        int[][] array = new int[10][2];
        for (int i = 0; i < 10; i++) {
            String str = br.readLine();
            array[i][0] = Integer.parseInt(str.split(" ")[0]);
            array[i][1] = Integer.parseInt(str.split(" ")[1]);
        }

        for (int[] innerArray : array) {
            int from = innerArray[0];
            int to = innerArray[1];
            List<Integer> compareList = new ArrayList<>();
            for (int i = 0; i <= to - from; i++) {
                compareList.add(answer[from + i - 1]);
            }
            Collections.reverse(compareList);
            for (int i = 0; i <= to - from; i++) {
                answer[from + i - 1] = compareList.get(i);
            }
        }

        System.out.println(Arrays.stream(answer).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}
