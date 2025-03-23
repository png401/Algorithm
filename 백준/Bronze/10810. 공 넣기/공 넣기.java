import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 공을 넣는 횟수

        int[] baskets = new int[N]; // 바구니 배열 (0으로 초기화됨)

        for (int m = 0; m < M; m++) {
            int i = sc.nextInt(); // 시작 바구니
            int j = sc.nextInt(); // 끝 바구니
            int k = sc.nextInt(); // 넣을 공 번호

            for (int b = i - 1; b <= j - 1; b++) {
                baskets[b] = k; // 공을 넣는다 (덮어쓰기)
            }
        }

        // 결과 출력
        for (int ball : baskets) {
            System.out.print(ball + " ");
        }
    }
}