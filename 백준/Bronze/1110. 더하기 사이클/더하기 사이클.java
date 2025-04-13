import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 시작 숫자
        int original = N;      // 처음 숫자를 저장
        int count = 0;

        do {
            int tens = N / 10;           // 십의 자리
            int ones = N % 10;           // 일의 자리
            int sum = tens + ones;       // 각 자리 숫자의 합
            N = (ones * 10) + (sum % 10); // 새로운 숫자 만들기
            count++;
        } while (N != original);         // 처음 숫자로 돌아올 때까지 반복

        System.out.println(count);
    }
}