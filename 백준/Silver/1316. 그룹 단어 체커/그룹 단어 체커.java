import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 단어 개수
        int groupWordCount = 0;

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (isGroupWord(word)) {
                groupWordCount++;
            }
        }

        System.out.println(groupWordCount);
    }

    // 그룹 단어인지 검사하는 함수
    public static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26];  // 알파벳 출현 여부 기록
        char prev = 0;

        for (int i = 0; i < word.length(); i++) {
            char cur = word.charAt(i);

            if (cur != prev) {
                if (seen[cur - 'a']) {
                    return false;  // 이전에 나왔던 문자면 그룹 단어 아님
                }
                seen[cur - 'a'] = true;
            }

            prev = cur;
        }

        return true;
    }
}