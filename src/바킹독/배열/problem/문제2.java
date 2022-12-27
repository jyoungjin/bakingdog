package 바킹독.배열.problem;

/**
 * 문제 2
 * 주어진 길이 N의 int 배열 arr에서 합이 100인 서로 다른 위치의 두 원소가 존재하면 1을, 존재하지 않으면 0을 반환하는 함수 func2(int arr[], int N)을 작성하라
 * arr의 각 수는 0 이상 100 이하이고 N은 1000 이하이다.
 */

public class 문제2 {

    // 시간복잡도 O(N)
    public int solution(int[] arr, int n) {
        int[] ref = new int[101];

        for (int i : arr) {
            if (ref[100 - i] == 1) {
                return 1;
            }
            ref[i] = 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        문제2 문제 = new 문제2();
        System.out.println(문제.solution(new int[]{4, 13, 63, 87}, 4));
    }
}
