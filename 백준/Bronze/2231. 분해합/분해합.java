import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum=0;
		//i=1부터 N까지 계속 1씩 증가시켜서 i+i의 자릿수들 합 구해서
		//N이랑 똑같아지면 멈추고 그때의 i값을 프린트 출력하면 된다.
		int i=1;
		for(i=1; i<N; i++) {
			sum=i;//sum값을 i로 초기화
			int temp=i;
			//sum에다가 i의 자릿수들 더하기
			while(temp>0) {
				int ones = temp % 10;
				sum += ones;
				temp = temp/10;
			}
			if(sum == N) {
				System.out.println(i);
				break;
			}
			//else System.out.println(0);//아니면 sum은 다시 초기화....
		}
		if(sum != N) System.out.println(0);
		//if(i==(N-1))System.out.println(0);
		
	}

}
