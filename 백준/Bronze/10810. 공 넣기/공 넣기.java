import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int [] arr = new int [N];
		
		for(int r=0; r<M; r++) {
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=sc.nextInt();
		
		for(int r1=(i-1); r1<=j-1; r1++) {
			arr[r1] = k;
		}
		
		}
		
		for(int r=0; r<N; r++) {
			System.out.print(arr[r]+" ");
		}
		
	}

}
