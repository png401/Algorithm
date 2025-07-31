import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // N 입력
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> cardSet = new HashSet<>();

        // 상근이의 카드 Set에 저장
        for (int i = 0; i < N; i++) {
            cardSet.add(Integer.parseInt(st.nextToken()));
        }

        // M 입력
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        // M개의 수에 대해 있는지 확인
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (cardSet.contains(num)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        // 출력
        System.out.println(sb.toString());
    }
}