import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int [] arr = new int [N];
		
		for(int k=0; k<N; k++) {
			arr[k] = k+1;
		}
		
		//i, j값 입력
		for(int l=0; l<M; l++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			for(int m=0; m<(j-i+1)/2; m++) {
				int temp = arr[i-1+m];
				arr[i-1+m]= arr[j-1-m];
				arr[j-1-m]=temp;
				
				
			}
		}
		
		//출력
		for(int o=0; o<arr.length; o++) {
			System.out.print(arr[o]+" ");
		}
		
	}
}
