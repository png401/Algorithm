import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 입력: 배열의 크기

        System.out.println(n); // 코드1이 실행되는 횟수
        System.out.println(1); // 수행 시간의 최고차항 차수는 1 (즉, O(n))
    }
}