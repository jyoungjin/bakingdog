package 바킹독;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x % 2 == 1) {
                arrayList.add(x);
            }
        }
        if (arrayList.size() == 0) {
            System.out.println(-1);
            return;
        }

        Collections.sort(arrayList);
        int a = arrayList.get(0);
        Integer b = arrayList
                .stream()
                .reduce(Integer::sum)
                .get();

        System.out.println(b);
        System.out.println(a);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solution();
    }
}
