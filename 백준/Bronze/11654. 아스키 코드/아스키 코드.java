import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0); // 첫 번째 문자 하나만 입력받기
        System.out.println((int) ch);  // 문자 -> 아스키 코드값 출력
    }
}