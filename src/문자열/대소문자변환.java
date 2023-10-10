package 문자열;

import java.util.Scanner;

/**
 * 대소문자 변환
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로
 * 변환하여 출력하는 프로그램을 작성하세요.
 * ▣ 입력설명
 * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 * ▣ 출력설명
 * 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 * ▣ 입력예제 1
 * StuDY
 * ▣ 출력예제 1
 * sTUdy
 */
public class 대소문자변환 {

    public String solution(String str) {
        StringBuilder sb = new StringBuilder();

        for (char alphabet : str.toCharArray()) {
            if (Character.isLowerCase(alphabet)) {
                sb.append(Character.toUpperCase(alphabet));
            } else {
                sb.append(Character.toLowerCase(alphabet));
            }
        }
        return sb.toString();
    }

    public String solution2(String str) {
        StringBuilder sb = new StringBuilder();

        for (char alphabet : str.toCharArray()) {
           if (alphabet >= 97 && alphabet <= 122) { // 소문자인 경우
               sb.append((char) (alphabet - 32));
           } else if (alphabet >= 65 && alphabet <= 90) { // 대문자인 경우
               sb.append((char) (alphabet + 32));
           }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        대소문자변환 대소문자변환 = new 대소문자변환();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.print(대소문자변환.solution(str));
//        System.out.print(대소문자변환.solution2(str));
    }
}
