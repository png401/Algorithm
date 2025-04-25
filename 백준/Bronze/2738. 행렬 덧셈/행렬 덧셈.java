import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int [][] A = fillMatrix(sc, N, M);
        int [][] B = fillMatrix(sc, N, M);
        
        
        //이번엔 리턴값 있는 함수. not void!
        int [][] result = sumMatrix(A, B);
        showMatrix(result);
    }
    //행렬 입력받는 함수
     public static int[][] fillMatrix (Scanner sc, int N, int M) {
    	 int [][] ar = new int[N][M];
    	 
    	 for(int i=0; i<ar.length; i++) {
    		 for(int j=0; j<ar[0].length; j++) {
    			 ar[i][j] = sc.nextInt();
    		 }
    	 }
    	 return ar;
     }
     
     public static int[][] sumMatrix(int[][] a, int[][]b){
    	 int rows = a.length;
    	 int cols = a[0].length;
    	 int [][] total = new int [rows][cols];
    	 for(int i=0; i<a.length; i++) {
    		 for(int j=0; j<a[0].length; j++) {
				total[i][j] = a[i][j]+b[i][j];
    		 }
    	 }
		return total;
     }
     
     //출력은 걍 void. 따로 리턴할 게 없고 출력하는 거니까
     //그니까 result 배열 받아서 그걸 그대로 출력..
     public static void showMatrix(int[][] a){
    	 for(int i=0; i<a.length; i++) {
    		 for(int j=0; j<a[0].length; j++) {
    			 System.out.print(a[i][j]+" ");
    		 }System.out.println();
    	 }
     }
    
}