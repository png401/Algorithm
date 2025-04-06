import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        
        scanner.close();
        
        // 45분 빼기
        M -= 45;
        
        if (M < 0) { // 분이 음수가 되면
            M += 60; // 분을 60 더해주고
            H--; // 시간을 1 줄인다
        }
        
        if (H < 0) { // 시간이 음수가 되면
            H = 23; // 23시로 변경
        }

        // 결과 출력
        System.out.println(H + " " + M);
    }
}