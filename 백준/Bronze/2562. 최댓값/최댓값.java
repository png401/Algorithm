import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;       // 최댓값 저장할 변수
        int index = 0;     // 최댓값이 몇 번째인지 저장할 변수

        for (int i = 1; i <= 9; i++) {
            int num = scanner.nextInt();  // 수 하나 입력

            if (num > max) {      // 지금까지 저장된 max보다 크면
                max = num;        // max를 바꾸고
                index = i;        // 위치(순서)도 저장
            }
        }

        // 출력
        System.out.println(max);
        System.out.println(index);
    }
}