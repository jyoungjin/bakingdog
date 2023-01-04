package 바킹독.연결리스트.problem;

import java.io.*;
import java.util.*;

/**
 * 한 줄로 된 간단한 에디터를 구현하려고 한다. 이 편집기는 영어 소문자만을 기록할 수 있는 편집기로, 최대 600,000글자까지 입력할 수 있다.
 *
 * 이 편집기에는 '커서'라는 것이 있는데, 커서는 문장의 맨 앞(첫 번째 문자의 왼쪽), 문장의 맨 뒤(마지막 문자의 오른쪽),
 * 또는 문장 중간 임의의 곳(모든 연속된 두 문자 사이)에 위치할 수 있다.
 * 즉 길이가 L인 문자열이 현재 편집기에 입력되어 있으면, 커서가 위치할 수 있는 곳은 L+1가지 경우가 있다.
 *
 * 이 편집기가 지원하는 명령어는 다음과 같다.
 *
 * L	커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
 * D	커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
 * B	커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨), 삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임
 * P $	$라는 문자를 커서 왼쪽에 추가함
 * 초기에 편집기에 입력되어 있는 문자열이 주어지고, 그 이후 입력한 명령어가 차례로 주어졌을 때, 모든 명령어를 수행하고 난 후 편집기에 입력되어 있는 문자열을 구하는 프로그램을 작성하시오.
 * 단, 명령어가 수행되기 전에 커서는 문장의 맨 뒤에 위치하고 있다고 한다.
 */
public class BOJ1406 {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        LinkedList<Character> linkedList = new LinkedList<>();
        for (char c : str.toCharArray()) {
            linkedList.add(c);
        }
        int idx = str.length();

        for (int i = 0; i < n; i++) {
            String in = br.readLine();
            if (in.charAt(0) == 'L') {
                if (idx >= 1) {
                    idx -= 1;
                }
                continue;
            }
            if (in.charAt(0) == 'D') {
                if (idx < str.length() - 1) {
                    idx += 1;
                }
                continue;
            }
            if (in.charAt(0) == 'B') {
                if (idx > 1) {
                    linkedList.remove(idx-1);
                }
                continue;
            }
            if (in.charAt(0) == 'P') {
                linkedList.add(idx++, in.charAt(2));
            }
        }

        String answer = "";
        for (Character character : linkedList) {
            answer += character;
        }

        bw.write(linkedList.toString());
        bw.flush();
    }

    public static void main(String[] args) throws IOException {
        BOJ1406 main = new BOJ1406();
        main.solution();
    }
}
