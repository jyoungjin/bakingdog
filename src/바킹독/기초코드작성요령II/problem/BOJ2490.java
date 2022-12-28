package 바킹독.기초코드작성요령II.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 우리나라 고유의 윷놀이는 네 개의 윷짝을 던져서 배(0)와 등(1)이 나오는 숫자를 세어 도, 개, 걸, 윷, 모를 결정한다.
 * 네 개 윷짝을 던져서 나온 각 윷짝의 배 혹은 등 정보가 주어질 때
 * 도(배 한 개, 등 세 개), 개(배 두 개, 등 두 개), 걸(배 세 개, 등 한 개), 윷(배 네 개), 모(등 네 개)
 * 중 어떤 것인지를 결정하는 프로그램을 작성하라.
 */
public class BOJ2490 {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] inputArr = new int[3][4];
        for (int i = 0; i < 3; i++) {
            String s = br.readLine();
            int[] temp = Arrays.stream(s.split(" ")).mapToInt(Integer::valueOf).toArray();
            System.arraycopy(temp, 0, inputArr[i], 0, 4);
        }
        List<String> answeres = new ArrayList<>();
        for (int[] arr : inputArr) {
            int sum = Arrays.stream(arr).reduce(Integer::sum).getAsInt();
            String temp = "";
            switch (sum) {
                case 0:
                    answeres.add("D");
                    break;
                case 1:
                    answeres.add("C");
                    break;
                case 2:
                    answeres.add("B");
                    break;
                case 3:
                    answeres.add("A");
                    break;
                case 4:
                    answeres.add("E");
                    break;
            }
        }
        for (String answer : answeres) {
            System.out.println(answer);
        }
    }

    public static void main(String[] args) throws IOException {
        BOJ2490 main = new BOJ2490();
        main.solution();
    }
}
