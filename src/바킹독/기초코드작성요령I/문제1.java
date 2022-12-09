package 바킹독.기초코드작성요령I;

/**
* 문제 1
* N 이하의 자연수 중에서 3의 배수이거나 5의 배수인 수를 모두 합한 값을 반환하는 함수 func1(int N)을 작성하라.
* N은 10만 이하의 자연수이다.
* */

public class 문제1 {

    // 시간복잡도 O(N)
    public int solution(int x) {
        int answer = 0;

        for (int i = 3; i <= x; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        문제1 문제 = new 문제1();
        System.out.println(문제.solution(34567));
    }
}
