import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        int[] alphabet = new int[26];
        
        // 처음에는 전부 -1로 초기화
        for (int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }

        // 문자열을 돌면서, 처음 나온 위치만 기록
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int idx = c - 'a'; // 'a'는 0번째, 'b'는 1번째 ...
            if (alphabet[idx] == -1) {
                alphabet[idx] = i;
            }
        }

        // 결과 출력
        for (int i = 0; i < 26; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}