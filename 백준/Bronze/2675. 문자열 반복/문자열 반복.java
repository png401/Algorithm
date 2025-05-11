import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            int R = sc.nextInt(); // 반복 횟수
            String S = sc.next(); // 문자열

            StringBuilder result = new StringBuilder();
            for (int j = 0; j < S.length(); j++) {
                char c = S.charAt(j);
                for (int k = 0; k < R; k++) {
                    result.append(c);
                }
            }
            System.out.println(result.toString());
        }

        sc.close();
    }
}