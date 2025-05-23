import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next(); // B진법 수
        int B = sc.nextInt(); // 진법

        // B진법 수를 10진법으로 변환
        int result = Integer.parseInt(N, B);

        System.out.println(result);
    }
}