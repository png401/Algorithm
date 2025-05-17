import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();  // 전체 문장 입력

        line = line.trim();  // 양쪽 공백 제거

        // 공백만 입력된 경우
        if (line.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = line.split(" +"); // 공백 1개 이상을 기준으로 split
            System.out.println(words.length);
        }
    }
}