import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int X = sc.nextInt();
	
	int [] ar = new int [N];
	int [] final_ar = new int [N];
	
	for(int i=0; i<N; i++) {
		ar[i] = sc.nextInt();
		
		if(ar[i] < X) {
			final_ar[i] = ar[i];
		}
	}
	
	for(int j=0; j<N; j++) {
		if(final_ar[j]!=0)
		System.out.print(final_ar[j]+" ");
	}
}
}
