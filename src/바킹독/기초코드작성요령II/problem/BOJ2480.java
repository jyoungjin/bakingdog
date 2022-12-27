package 바킹독.기초코드작성요령II.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/**
 * 주사위 세개
 */
public class BOJ2480 {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        String s = br.readLine();
        for (String s1 : s.split(" ")) {
            arrayList.add(Integer.parseInt(s1));
        }
        Collections.sort(arrayList);

        if (arrayList.get(0) == arrayList.get(2)) {
            System.out.println(10000 + arrayList.get(0) * 1000);
        } else if (Objects.equals(arrayList.get(0), arrayList.get(1))) {
            System.out.println(1000 + arrayList.get(0) * 100);
        } else if (Objects.equals(arrayList.get(1), arrayList.get(2))) {
            System.out.println(1000 + arrayList.get(1) * 100);
        } else {
            System.out.println(arrayList.get(2) * 100);
        }
    }

    public static void main(String[] args) throws IOException {
        BOJ2480 main = new BOJ2480();
        main.solution();
    }
}
