package 투포인터와슬라이딩윈도우;

import java.util.Scanner;

/**
 * 연속 부분수열
 *
 * N개의 수로 이루어진 수열이 주어집니다.
 * 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을
 * 작성하세요.
 * 만약 N=8, M=6이고 수열이 다음과 같다면
 * 1 2 1 3 1 1 1 2
 * 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
 * ▣ 입력설명
 * 첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.
 * 수열의 원소값은 1,000을 넘지 않는 자연수이다.
 * ▣ 출력설명
 * 첫째 줄에 경우의 수를 출력한다.
 * ▣ 입력예제 1
 * 8 6
 * 1 2 1 3 1 1 1 2
 * ▣ 출력예제 1
 * 3
 */
public class 연속부분수열 {
    public int solution(int n, int target, int[] arr) {
        int answer = 0, sum = 0, left = 0;
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            if (sum == target) {
                answer++;
            }

            while (sum >= target) {
                sum -= arr[left++];
                if (sum == target) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        연속부분수열 연속부분수열 = new 연속부분수열();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int target = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(연속부분수열.solution(n, target, arr));
    }
}
