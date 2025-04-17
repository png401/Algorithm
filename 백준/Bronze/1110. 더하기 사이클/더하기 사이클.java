import java.util.Scanner;
//새로운 숫자 만들기 를 간과하면 안돼
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int first = N;
		
		int tens;
        int ones;
        int sum;
		int count = 0;
		
		while(true) {
			tens = N/10;
			ones = N%10;
			sum = tens+ones;
			
			N = ones*10+sum%10;
			
			count++;
			
			if(first==N) break;	
		}
        System.out.println(count);
	}
}
