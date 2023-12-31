package 문자열;

import java.util.Scanner;

/**
 * 숫자만 추출
 *
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만
 * 듭니다.
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205
 * 이 됩니다.
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 * ▣ 입력설명
 * 첫 줄에 숫자가 썩인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 * ▣ 출력설명
 * 첫 줄에 자연수를 출력합니다.
 * ▣ 입력예제 1
 * g0en2T0s8eSoft
 * ▣ 출력예제 1
 * 208
 */
public class 숫자만추출 {
    public int solution(String str) {
        int answer = 0;
        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57) {
                answer = answer * 10 + (c - 48);
            }
        }
        return answer;
    }

    public int solution2(String str) {
        StringBuilder answer = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                answer.append(c);
            }
        }
        return Integer.parseInt(answer.toString());
    }

    public static void main(String[] args) {
        숫자만추출 숫자만추출 = new 숫자만추출();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
//        System.out.println(숫자만추출.solution(str));
        System.out.println(숫자만추출.solution2(str));
    }
}
