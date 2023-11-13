package 바킹독;

public class Main {

    public int solution(int n) {
        int answer = 1;

        while (2 * answer < n) {
            answer = 2 * answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int solution = main.solution(1);
        System.out.println("solution = " + solution);

    }
}
