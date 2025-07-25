import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 포켓몬 수
        int M = sc.nextInt(); // 문제 수
        sc.nextLine(); // 버퍼 제거

        Map<String, Integer> nameToNum = new HashMap<>();
        Map<Integer, String> numToName = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = sc.nextLine();
            nameToNum.put(name, i);
            numToName.put(i, name);
        }

        for (int i = 0; i < M; i++) {
            String query = sc.nextLine();
            if (isNumeric(query)) {
                int num = Integer.parseInt(query);
                System.out.println(numToName.get(num));
            } else {
                System.out.println(nameToNum.get(query));
            }
        }
    }

    public static boolean isNumeric(String s) {
        return s.chars().allMatch(Character::isDigit);
    }
}
