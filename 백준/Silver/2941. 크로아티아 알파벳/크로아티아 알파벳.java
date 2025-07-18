import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String s : croatia) {
            input = input.replace(s, "*");  // 특수한 조합을 하나의 문자로 치환
        }

        System.out.println(input.length());
    }
}