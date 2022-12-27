package 바킹독.기초코드작성요령I.problem;

/**
 * 문제 3
 * N이 제곱수이면 1을 반환하고 제곱수가 아니면 0을 반환하는 함수 func3(int N)을 작성하라.
 * N은 10억 이하의 자연수이다.
 */

public class 문제3 {

    // 시간복잡도 O(root N)
    public int solution(int n) {

        for (int i = 1; i * i < n; i++) {
            if (i * i == n) {
                return 1;
            }
        }
        return 0;

        /*  내 풀이
        double sqrt = Math.sqrt(n);
        int x = (int) sqrt;
        if (x * x == n) {
            return 1;
        }
        return 0;
        */
    }

    public static void main(String[] args) {
        문제3 문제 = new 문제3();
        System.out.println(문제.solution(5));
    }
}
