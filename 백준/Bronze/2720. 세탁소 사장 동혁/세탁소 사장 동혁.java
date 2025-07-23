import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            int cents = sc.nextInt();

            int q = cents / 25;
            cents %= 25;

            int d = cents / 10;
            cents %= 10;

            int n = cents / 5;
            cents %= 5;

            int p = cents; // 남은 건 모두 1센트

            System.out.println(q + " " + d + " " + n + " " + p);
        }

        sc.close();
    }
}