package 문자열;

import java.util.Scanner;

/**
 * 특정 문자 뒤집기
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 자기
 * 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 * ▣ 입력설명
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 * ▣ 출력설명
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 * ▣ 입력예제 1
 * a#b!GE*T@S
 * ▣ 출력예제 1
 * S#T!EG*b@a
 */
public class 특정문자뒤집기 {
    public String solution(String str) {
        String answer = "";
        char[] charArr = str.toCharArray();
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (!Character.isAlphabetic(charArr[left])) {
                left++;
            } else if (!Character.isAlphabetic(charArr[right])) {
                right--;
            } else {
                char tmp = charArr[left];
                charArr[left] = charArr[right];
                charArr[right] = tmp;
                left++;
                right--;
            }
        }
        answer = String.valueOf(charArr);
        return answer;
    }


    public static void main(String[] args) {
        특정문자뒤집기 특정문자뒤집기 = new 특정문자뒤집기();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(특정문자뒤집기.solution(str));
    }
}
