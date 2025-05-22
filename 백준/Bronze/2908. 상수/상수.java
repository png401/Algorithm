import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 수를 입력받음
        String a = sc.next();
        String b = sc.next();

        // 문자열을 뒤집음
        int reversedA = Integer.parseInt(new StringBuilder(a).reverse().toString());
        int reversedB = Integer.parseInt(new StringBuilder(b).reverse().toString());

        // 더 큰 수 출력
        System.out.println(Math.max(reversedA, reversedB));
    }
}