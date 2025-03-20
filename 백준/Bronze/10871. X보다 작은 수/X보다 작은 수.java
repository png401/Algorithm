import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int X = input.nextInt();
		
		int number [] = new int [N];
		
		for(int i=0; i<N; i++) {
			number[i] = input.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			if(number[i]<X) {
				System.out.print(number[i]+" ");
			}
		}
		
	}

}
