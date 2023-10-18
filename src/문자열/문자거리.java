package 문자열;

import java.util.Scanner;

/**
 * 가장 짧은 문자거리
 * <p>
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출
 * 력하는 프로그램을 작성하세요.
 * ▣ 입력설명
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 문자열의 길이는 100을 넘지 않는다.
 * ▣ 출력설명
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 * ▣ 입력예제 1
 * teachermode e
 * ▣ 출력예제 1
 * 1 0 1 2 1 0 1 2 2 1 0
 */
public class 문자거리 {

    public int[] solution(String str, char target) {
        int[] answer = new int[str.length()];

        int value = 10000;
        // 왼쪽에 있는 target 문자로 부터 떨어진 거리
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                value = 0;
                answer[i] = value;
            } else {
                value++;
                answer[i] = value;
            }
        }

        // 오른쪽에서부터 target 문자로부터 떨어진 거리 구한다.
        value = 10000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == target) {
                value = 0;
            } else {
                value++;
                answer[i] = Math.min(answer[i], value);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        문자거리 문자거리 = new 문자거리();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char target = scanner.next().charAt(0);

        for (int distance : 문자거리.solution(str, target)) {
            System.out.print(distance + " ");
        }
    }
}
