import java.util.*;  // Scanner, HashSet, ArrayList, Collections 등을 사용하기 위한 패키지

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 입력을 받기 위한 Scanner 객체 생성

        int N = sc.nextInt(); // 듣도 못한 사람 수 입력
        int M = sc.nextInt(); // 보도 못한 사람 수 입력

        Set<String> unheard = new HashSet<>(); // 듣도 못한 사람을 저장할 HashSet
        List<String> result = new ArrayList<>(); // 결과(듣보잡)를 저장할 리스트

        for (int i = 0; i < N; i++) {
            unheard.add(sc.next());  // 듣도 못한 사람을 HashSet에 저장
        }

        for (int i = 0; i < M; i++) {
            String name = sc.next();  // 보도 못한 사람 입력
            if (unheard.contains(name)) {  // 듣도 못한 명단에 있으면
                result.add(name);  // 듣보잡이므로 리스트에 추가
            }
        }

        Collections.sort(result);  // 사전순 정렬
        System.out.println(result.size());  // 듣보잡 수 출력

        for (String name : result) {
            System.out.println(name);  // 듣보잡 이름 하나씩 출력
        }
    }
}