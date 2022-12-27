package 바킹독.기초코드작성요령II.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 세수 정렬
 */
public class BOJ2752 {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        String s = br.readLine();
        for (String s1 : s.split(" ")) {
            arrayList.add(Integer.parseInt(s1));
        }

        Collections.sort(arrayList);
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
    }

    public static void main(String[] args) throws IOException {
        BOJ2752 main = new BOJ2752();
        main.solution();
    }
}
