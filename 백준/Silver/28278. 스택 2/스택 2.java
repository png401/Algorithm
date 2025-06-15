import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 빠른 출력
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); // 명령 개수
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (input.startsWith("1")) {
                // "1 x" 명령: 스택에 x 추가
                int x = Integer.parseInt(input.split(" ")[1]);
                stack.push(x);
            } else if (input.equals("2")) {
                // "2" 명령: 스택에서 pop
                if (stack.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }
            } else if (input.equals("3")) {
                // "3" 명령: 스택 크기
                sb.append(stack.size()).append("\n");
            } else if (input.equals("4")) {
                // "4" 명령: 스택이 비었는지
                sb.append(stack.isEmpty() ? "1\n" : "0\n");
            } else if (input.equals("5")) {
                // "5" 명령: 스택 top 출력
                if (stack.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(stack.peek()).append("\n");
                }
            }
        }

        // 출력
        System.out.print(sb);
    }
}