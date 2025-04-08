import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int num_5 = N/5;
		int num_3=-1;
		
		for(int i = num_5; i>0; i--) {
			int b = N - num_5*5;
			
			if(b%3!=0) {
				num_5--;
				int N_minus = N-5*num_5;
				if(N_minus % 3 == 0)
					num_3 = N_minus / 3;
			}
			
			else num_3 = b/3;
		}
		
		if(N==3)num_3 = 1;
		
		System.out.println(num_5+num_3);
		
		/*
		 N/5
		 N%5 -> 3보다  N/5--;
		 
		 * */
		
	}

}
