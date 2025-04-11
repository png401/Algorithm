import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int [][] A = new int [N][M];
		int [][] B = new int [N][M];
		int [][] result = new int [N][M];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		
		
		for(int b=0; b<N; b++) {
			for(int a=0; a<M; a++) {
				result[b][a] = A[b][a] + B[b][a];
			}
		}
		
		for(int c=0; c<N; c++) {
			for(int d=0; d<M; d++) {
				System.out.print(result[c][d]+" ");
			}
			System.out.println();
		}
		
		
	}

}
