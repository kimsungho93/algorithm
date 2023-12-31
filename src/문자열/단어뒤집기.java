package 문자열;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 단어 뒤집기
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 * ▣ 입력설명
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되
 * 어 있습니다.
 * ▣ 출력설명
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 * ▣ 입력예제 1
 * 3
 * good
 * Time
 * Big
 * ▣ 출력예제 1
 * doog
 * emiT
 * giB
 */
public class 단어뒤집기 {
    public ArrayList<String> solution(int n, String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();

        for (String word : strArr) {
            String reverseWord = new StringBuilder(word).reverse().toString();
            answer.add(reverseWord);
        }

        return answer;
    }

    public ArrayList<String> solution2(int n, String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();

        for (String word : strArr) {
            char[] charArr = word.toCharArray();
            int left = 0, right = word.length() - 1;

            while (left < right) {
                char tmp = charArr[left];
                charArr[left] = charArr[right];
                charArr[right] = tmp;
                left++;
                right--;
            }

            String reverseWord = String.valueOf(charArr);
            answer.add(reverseWord);
        }

        return answer;
    }


    public static void main(String[] args) {
        단어뒤집기 단어뒤집기 = new 단어뒤집기();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = scanner.next();
        }

        for(String reverseWord : 단어뒤집기.solution(n, strArr)) {
            System.out.println(reverseWord);
        }

//        for(String reverseWord : 단어뒤집기.solution2(n, strArr)) {
//            System.out.println(reverseWord);
//        }
    }
}
