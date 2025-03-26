import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        
        System.out.println(A+B+C);
        
        sc.close();
        /*
        1. 정수를 다룰 때
        -값이 2억 정도보다 작을 경우 int
        -값이 2억 이상 9경 이하일 경우 long
        -메모리가 중요하고, 값이 작은 정수일 경우 byte or short
        
        2. 소수를 다룰 때
        -일반적인 실수 연산 float
        -더 정밀한 실수 연산이 필요할 경우 double
        -금융 계산(정확한 소수점 연산 필요) BigDecimal(소수점 오차 방지)
        
        */
    }
    
}