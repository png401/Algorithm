import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] board = new boolean[100][100]; // 흰 도화지 영역
        int n = sc.nextInt(); // 색종이 수
        int total = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(); // 왼쪽에서부터의 거리 (열 번호)
            int y = sc.nextInt(); // 아래쪽에서부터의 거리 (행 번호)

            // 좌표 기준이 아래에서부터 시작하므로 위에서부터 보기 위해 board[y][x] 순서를 주의
            for (int r = y; r < y + 10; r++) {
                for (int c = x; c < x + 10; c++) {
                    if (!board[r][c]) {
                        board[r][c] = true;
                        total++;
                    }
                }
            }
        }

        System.out.println(total);
    }
}