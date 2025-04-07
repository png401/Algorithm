import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] ar = new int [N];
		//int max=-1000001,min=1000000;
		
		for(int i=0; i<N; i++) {
			ar[i] = sc.nextInt();
		}
		
		int max = ar[0];
		int min = ar[0];
		
		for(int i=0; i<N; i++) {
			if(ar[i]>max) max = ar[i];
			
			if(ar[i]<min) min = ar[i];
		}
		
		System.out.print(min + " "+max);
	}

}