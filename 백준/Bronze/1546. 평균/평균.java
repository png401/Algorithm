import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 과목 수
        double[] scores = new double[n];
        double max = 0;

        // 점수 입력과 동시에 최고 점수 구하기
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextDouble();
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        // 점수 조정 및 평균 계산
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (scores[i] / max) * 100;
        }

        double average = sum / n;
        System.out.println(average);
    }
}