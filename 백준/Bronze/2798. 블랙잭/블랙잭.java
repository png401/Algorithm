import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 카드 개수
        int M = sc.nextInt();  // 목표 값
        int[] cards = new int[N];

        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();  // 카드에 쓰인 숫자들 입력
        }

        int max = 0;

        // 브루트포스: 모든 3장의 카드 조합을 확인
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= M && sum > max) {
                        max = sum;  // M 이내이면서 가장 큰 합 저장
                    }
                }
            }
        }

        System.out.println(max);
    }
}